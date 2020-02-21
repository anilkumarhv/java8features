package com.company.java8.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        String line="<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";

        boolean matchFound = false;
        Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = r.matcher(line);

        while (m.find()) {
//            System.out.println(m.group(0));
//            System.out.println(m.group(1));
            System.out.println(m.group(2));
            matchFound = true;
        }
        if ( ! matchFound) {
            System.out.println("None");
        }


    }
}
