package Codeup;

import java.util.Scanner;

public class codeup1027 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a[] = sc.next().split("\\.");

        int a1 = Integer.parseInt(a[0]);
        int a2 = Integer.parseInt(a[1]);
        int a3 = Integer.parseInt(a[2]);
        System.out.printf("%02d-%02d-%04d",a3,a2,a1);
    }
    
}
