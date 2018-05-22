package com.github.yanzheshi.behavior.chainofresponsibility;

/**
 * @author shiyanzhe
 */
public class Response {
    private String value;

    public Response(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Response{" +
                "value='" + value + '\'' +
                '}';
    }
}

