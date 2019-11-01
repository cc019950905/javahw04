package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        int ss=sc.nextInt();
        int mm =ss/60;
        int hh=0;

        if(mm>=60){
            hh=mm/60;
            mm=mm-hh*60;
            ss=ss-hh*60*60-mm*60;
            System.out.println(hh+"小時"+mm+"分"+ss+"秒");

        }else{
            ss=ss-mm*60;
            System.out.println(hh+"小時"+mm+"分"+ss+"秒");
        }
    }
}
