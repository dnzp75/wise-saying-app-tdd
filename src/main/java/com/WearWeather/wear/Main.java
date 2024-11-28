package com.WearWeather.wear;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // 사람이 직접 테스트 하는 코드
        lab1();

        lab2();
    }

    private static void lab1() {
        // 사람이 키보드로 입력한 System.in을 입력받음
        Scanner scanner = new Scanner(System.in);

        System.out.println("명령");
        String cmd = scanner.nextLine().trim();

        System.out.println("입력한 명령: " + cmd);
    }

    private static void lab2() {
        // 메롱이 선 입력된 in을 자동으로 입력받는다.
        InputStream in = new ByteArrayInputStream("메롱".getBytes());

        Scanner scanner = new Scanner(in);

        System.out.println("명령");
        String cmd = scanner.nextLine().trim();

        System.out.println("입력한 명령: " + cmd);


    }
}