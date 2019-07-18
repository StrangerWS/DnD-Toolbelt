package com.strangerws.dnd.info.util;

public class StringUtils {

    public static String removeBrackets(String s){
        return s.replace("(", "").replace(")", "");
    }

}
