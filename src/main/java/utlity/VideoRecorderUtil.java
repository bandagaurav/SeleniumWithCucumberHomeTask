package utlity;

import org.monte.media.Format;
import org.monte.media.Registry;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;

import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

public class VideoRecorderUtil {

    private ScreenRecorder screenRecorder;
    private File videoFile;

    public void startRecording(String fileName) throws IOException, AWTException {
        File file = new File("./target/videos/");
        if (!file.exists()) {
            file.mkdirs();
        }

        this.videoFile = new File(file, fileName + ".avi");
        this.screenRecorder = new SpecializedScreenRecorder(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()), videoFile);
        this.screenRecorder.start();
    }

    public void stopRecording() throws IOException {
        this.screenRecorder.stop();
    }

    public String encodeVideoToBase64() throws IOException {
        byte[] videoBytes = Files.readAllBytes(this.videoFile.toPath());
        return Base64.getEncoder().encodeToString(videoBytes);
    }

    private class SpecializedScreenRecorder extends ScreenRecorder {

        private File file;

        public SpecializedScreenRecorder(Rectangle captureArea, File file) throws IOException, AWTException {
            super(GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration(),
                    captureArea,
                    new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
                    new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                            CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                            DepthKey, 24, FrameRateKey, Rational.valueOf(15),
                            QualityKey, 1.0f,
                            KeyFrameIntervalKey, 15 * 60),
                    new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
                            FrameRateKey, Rational.valueOf(30)),
                    null, file);
            this.file = file;
        }

        @Override
        protected File createMovieFile(Format fileFormat) throws IOException {
            return this.file;
        }
    }
}
