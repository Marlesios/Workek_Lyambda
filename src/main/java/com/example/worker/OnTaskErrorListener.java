package com.example.worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
