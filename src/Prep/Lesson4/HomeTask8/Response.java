package Prep.Lesson4.HomeTask8;

public class Response {
    String responseBody;
    int statusCode;
    String responseType;

    public Response(String responseBody, int statusCode, String responseType) {
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.responseType = responseType;
    }
}
