package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println('a');
        int a = in.nextInt();
        System.out.println('b');
        int b = in.nextInt();
        System.out.println('c');
        int c = in.nextInt();
        System.out.println('x');
        int x = in.nextInt();
if (x<0 & b!=0) {
    int f= a-x/(10+b);
    System.out.println(f);
}
else {
    if (x>0 & b==0){
        int f=(x-a)/(x-c);
        System.out.println(f);
    }
    else {
        int f=3*x+c/2;
        System.out.println(f);
    }
    }
}
    }

