package lesson1;

import java.security.MessageDigest;

public class Quiz {
    public static void main(String[] args) throws Exception {

        System.out.println();
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf(String.valueOf(b));

            System.out.println();

        }

    }
}
