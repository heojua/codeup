package Codeup;

import java.util.Scanner;

public class codeup1045 {
    public static void main(String[] in){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c=(a*1.0)/b;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.printf("%.2f",c);
    }
    
}
