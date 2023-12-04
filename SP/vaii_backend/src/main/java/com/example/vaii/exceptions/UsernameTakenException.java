package com.example.vaii.exceptions;

public class UsernameTakenException extends IllegalMonitorStateException {
    public UsernameTakenException(String s) {
        super(s);
    }
}
