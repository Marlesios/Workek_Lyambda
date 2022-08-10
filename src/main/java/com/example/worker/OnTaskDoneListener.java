package com.example.worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
