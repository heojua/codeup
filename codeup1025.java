package Codeup;

import java.util.Scanner;

public class codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.next().split("");

        int a1=Integer.parseInt(a[0]);
        int a2=Integer.parseInt(a[1]);
        int a3=Integer.parseInt(a[2]);
        int a4=Integer.parseInt(a[3]);
        int a5=Integer.parseInt(a[4]);

            System.out.printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]\n",a1*10000,a2*1000,a3*100,a4*10,a5*1);
        }
    }
    