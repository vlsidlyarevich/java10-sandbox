package com.github.vlsidlyarevich.java10_sandbox.http.services;

import com.github.vlsidlyarevich.java10_sandbox.http.model.HttpCall;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;

import java.io.IOException;

import static jdk.incubator.http.HttpResponse.BodyHandler.asString;

public class IncubatorHttpClientService implements HttpClientService {

    private final HttpClient httpClient;

    public IncubatorHttpClientService() {
        this.httpClient = HttpClient.newHttpClient();
    }

    public String get(final HttpCall httpCall) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder(httpCall.getUrl())
                .GET()
                .build();

        return httpClient.send(request, asString()).body();
    }
}
