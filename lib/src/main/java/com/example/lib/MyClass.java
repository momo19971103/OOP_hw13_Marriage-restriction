package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�п�J�ʧO(�k�B�k)");
        String s = scanner.next();
        while (s.matches("�k")==false&&s.matches("�k")==false){
            System.out.println("�п�J�ʧO(�k�B�k)");
            s = scanner.next();
        }
        if(s.matches("�k")){
            System.out.println("�п�J�~��");
            int age = scanner.nextInt();
            if(age<18){
                System.out.println("�A���൲�B");
            }
            else {
                System.out.println("�A�i�H���B");
            }
        }
        if(s.matches("�k")){
            System.out.println("�п�J�~��");
            int age = scanner.nextInt();
            if(age<16){
                System.out.println("�p���൲�B");
            }
            else {
                System.out.println("�p�i�H���B");
            }

        }
    }
}
