package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("a");
        int a=in.nextInt();
        double z1= 1-(0.25*Math.pow(2,Math.sin(2*a)))+Math.cos(2*a);
        double z2= Math.pow(2,Math.cos(a))+Math.pow(4,Math.cos(a));
        System.out.println(z1);
        System.out.println(z2);
    }
}
