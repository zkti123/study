package com.green.javasub.sh02;

public class StringEx {
    public static void main(String[] args) {
        String name = "ja"+"va";
        //name = "java";
        System.out.println(name);

        String str = name + 8.0+1.0;
        System.out.println(str);

        String str2 = name +(8.0+1.0);
        System.out.println(str2);

    }
}
