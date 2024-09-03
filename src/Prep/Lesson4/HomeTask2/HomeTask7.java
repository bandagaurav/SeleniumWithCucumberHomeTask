package Prep.Lesson4.HomeTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HomeTask7 {
    public static void main(String args[]) {

        List<Response> responses = new ArrayList<>();
        responses.add(new Response("Success", 200, "JSON"));
        responses.add(new Response("Error", 400, "JSON"));
        responses.add(new Response("Error", 400, "XML"));
        responses.add(new Response("Partial Content", 206, "JSON"));
        responses.add(new Response("Not Found", 404, "HTML"));

        //Predicate<Response> isStatusCode400 = response -> response.statusCode == 400;
        Predicate<Response> isResponseTypeJSON = response -> "JSON".equals(response.responseType);

        System.out.println("\nResponses with response type JSON:");
        filterAndPrintResponses(responses, isResponseTypeJSON);
    }


    private static void filterAndPrintResponses(List<Response> responses, Predicate<Response> predicate) {
        for (Response response : responses) {
            if (predicate.test(response)) {
                System.out.println(response);
            }
        }
    }
}

