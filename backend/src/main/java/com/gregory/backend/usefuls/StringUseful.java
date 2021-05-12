package com.gregory.backend.usefuls;

public class StringUseful {

    public static boolean isNullOrEmpty(Object obj) {
        return obj == null || obj.toString().isEmpty();
    }
}
