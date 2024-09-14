package org.example.notecollector.util;

import java.util.UUID;

public class AppUtil {
    public static String generateID(){
        return "NOTEID"+ UUID.randomUUID();
    }
}
