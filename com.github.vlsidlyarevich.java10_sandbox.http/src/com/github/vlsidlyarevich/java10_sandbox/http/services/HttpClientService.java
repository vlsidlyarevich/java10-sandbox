package com.github.vlsidlyarevich.java10_sandbox.http.services;

import com.github.vlsidlyarevich.java10_sandbox.http.model.HttpCall;

import java.io.IOException;

public interface HttpClientService {

    String get(HttpCall httpCall) throws IOException, InterruptedException;
}
