package com.green.java.ch04;

public class ForStudy3 {
    public static void main(String[] args) {

        for (int i=0; i<3; i++){

            for (int z=0; z<5; z++){
                System.out.printf("i:%d, z: %d\n", i, z);
            }
        }

        }
    }
//안쪽 for문을 바깥쪽 for문 만큼 돌린다 z를 i<3만큼 돌린다