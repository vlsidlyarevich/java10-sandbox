package com.github.vlsidlyarevich.java10_sandbox.http.model;

import java.net.URI;

public class HttpCall {

    private URI url;

    public HttpCall(URI url) {
        this.url = url;
    }

    public URI getUrl() {
        return url;
    }
}
