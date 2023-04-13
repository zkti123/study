package com.green.java.ch03;

public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");//str2에 abc란 객체를 만듦
        String str3 = new String("abc");//str3에 abc란 객체를 만듦

        System.out.printf("\"abc\" == \"abc\" = \t%b\n", str1 == str2);
        System.out.printf("\"str1\" = \"str2\" = \t%b\n",str2.equals(str1));
        System.out.printf("\"str2\" = \"str3\" = \t%b\n", str2.equals(str3));
        System.out.println(str2.equals(str3));

        String str4 = new String("aBc");
        System.out.println("str1.eqaulas(str4) = " + str4.equals(str1));
        System.out.println("str1.eqaulasignoreCase(str4) = " + str4.equalsIgnoreCase(str1));
    }
}
