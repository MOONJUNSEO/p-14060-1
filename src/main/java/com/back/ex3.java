package com.back;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("== 명령 앱 ==");
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (true){
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if (cmd.equals("등록")){
                System.out.print("명언 : ");
                String wise = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();
                System.out.println(i+"번 명언이 등록되었습니다.");
                i++;

            } else if (cmd.equals("종료")) {
                break;
            }
        }
        scanner.close();
    }
}
