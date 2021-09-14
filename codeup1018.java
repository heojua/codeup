package Codeup;

import java.util.Scanner;

public class codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time[] = sc.next().split(":");   //:를 기준으로 배열을 구분하여 리턴
        System.out.println(time[0]+":"+time[1]);
    }
    
}
