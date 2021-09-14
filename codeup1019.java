package Codeup;

import java.util.Scanner;

public class codeup1019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String day[] = sc.next().split("\\.");

        int day1=Integer.parseInt(day[0]);   // Integer.parseInt(String s) 문자열을 숫자열로 변환시켜 줌.
        int day2=Integer.parseInt(day[1]);
        int day3=Integer.parseInt(day[2]);
        System.out.printf("%04d.%02d.%02d",day1,day2,day3);
//%04d 의 의미
//% -  명령의시작
//0 - 채워질 문자
//4 - 총 자리수
//d - 십진정수

    }
}
