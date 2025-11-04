package com.back;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex4  {
    public static void main(String[] args) {
        System.out.println("== 명령 앱 ==");
        Scanner scanner = new Scanner(System.in);
        List<WiseSaying> wiseSayings = new ArrayList<>();
        int id = 1;
        while (true){
            System.out.print("명령) ");
            String cmd = scanner.nextLine();
            if (cmd.equals("등록")){
                System.out.print("명언 : ");
                String content = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();
                WiseSaying wiseSaying = new WiseSaying(id, content, author);
                wiseSayings.add(wiseSaying);
                System.out.println(id+"번 명언이 등록되었습니다.");
                id++;

            } else if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("목록")) {
                System.out.println("번호 / 작가/ 명언");
                System.out.println("----------------------");
                for (int i = wiseSayings.size()-1; i>=0; i--){
                    WiseSaying ws = wiseSayings.get(i);
                    System.out.printf("%d / %s / %s", ws.getId(),ws.getAuthor(), ws.getContent());
                }

            }
        }
        scanner.close();
    }
}

