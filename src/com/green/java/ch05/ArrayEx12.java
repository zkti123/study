package com.green.java.ch05;

public class ArrayEx12 {
    public static void main(String[] args) {

        String[]  names = {"kim", "park","Yi"};

        for (int i = 0; i < names.length; i++) {
            String nm = names[i];
            System.out.printf("names[%d]: %s\n", i, nm);
        }
        names[0] = "Yu";
        int i = 0;
        for (String nm : names){
            System.out.println(nm);
        }







    }
}
