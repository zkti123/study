package com.green.javasub.sh03;

public class OperateorEx24 {
    public static void main(String[] args) {
   boolean r1 = true && (10/0>0) && false; // false가 될 가능이 높은걸 앞에 두기.
        System.out.println(r1);

        boolean r2 = true || (10/0>0) || true;//true가 될 가능이 높은걸 앞에 두기.
        System.out.println(r2);





    }
}
