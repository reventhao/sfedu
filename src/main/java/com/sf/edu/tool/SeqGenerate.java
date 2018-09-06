package com.sf.edu.tool;

import java.util.Random;

public class SeqGenerate {

    public static String getSeq(int length) {
        String seq = "";
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                seq += randomCode();
            } else {
                seq += randomNum();
            }
        }
        return seq;
    }

    public static String randomCode() {
        String code = String.valueOf((char) (new Random().nextInt(26) + 65));
        return code;
    }

    public static String randomNum() {
        String num = String.valueOf(new Random().nextInt(10));
        return num;
    }
}
