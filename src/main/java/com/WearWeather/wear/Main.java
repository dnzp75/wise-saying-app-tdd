package com.WearWeather.wear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // 사람이 직접 테스트 하는 코드
        lab1();
    }

    private static void lab1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("명령");
        String cmd = scanner.nextLine().trim();

        System.out.println("입력한 명령: " + cmd);
    }
}