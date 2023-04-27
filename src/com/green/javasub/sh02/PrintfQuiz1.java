package com.green.javasub.sh02;

public class PrintfQuiz1 {
    public static void main(String[] args) {
    char bloodType = 'A';
    String name = "홍길동";
    int age = 24;
    float height = 178.82f;
    boolean inStudent = true;

        System.out.printf("나의이름은 %s이고 나이는 %d 키는 %.1f이고 혈액형은 %c입니다. 그리고 학교를 다니냐? %b", name, age,height,bloodType, inStudent);

    }
}
