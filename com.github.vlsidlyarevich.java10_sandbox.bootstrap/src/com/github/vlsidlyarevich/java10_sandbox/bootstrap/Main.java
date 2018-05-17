package com.github.vlsidlyarevich.java10_sandbox.bootstrap;

import com.github.vlsidlyarevich.java10_sandbox.http.model.HttpCall;
import com.github.vlsidlyarevich.java10_sandbox.http.services.HttpClientService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        var x = 5;

        System.out.println("X is: " + x);

        varInLoops();
        varInUrls();

        final String body = ServiceLoader.load(HttpClientService.class).findFirst().get()
                .get(new HttpCall(new URI("https://github.com/vlsidlyarevich")));

        System.out.println("Page body: " + body.substring(0, 50));
    }

    public static void varInLoops() {
        final List<Integer> list = IntStream.range(1, 10)
                .boxed()
                .collect(Collectors.toList());

        for (var i : list) {
            System.out.println("I is: " + i);
        }
    }

    public static void varInUrls() throws IOException {
        final var url = new URL("https://github.com/vlsidlyarevich");
        final var connection = url.openConnection();
        final var br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        br.lines().limit(5)
                .forEach(System.out::println);
    }
}
