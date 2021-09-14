package Codeup;

import java.util.Scanner;

public class codeup1046 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d=((a+b+c)*1.0)/3;
        System.out.println(a+b+c);
        System.out.printf("%.1f",d);
        
    }
}
