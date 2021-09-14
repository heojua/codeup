package Codeup;

import java.util.Scanner;

public class codeup1024 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a = sc.next();
        int len=a.length();   // length 문자열의 길이를 알고자 할 때.
        for(int i=0;i<len;i++){
            System.out.printf("\'%c\'\n",a.charAt(i));    // charAt()  String으로 저장된 문자열 중에서 
                                                          // 한 글자만 선택해서 변환해주는 역할.
                                                          //https://colossus-java-practice.tistory.com/31
        }
    }
    
}
