package com.WearWeather.wear;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // 사람이 직접 테스트 하는 코드
        lab1();
        lab2();
        lab3();
        lab4();
    }

    private static void lab1() {
        // 사람이 키보드로 입력한 System.in을 입력받음
        // 키보드 수동 입력 -> 모니터 출력
        Scanner scanner = new Scanner(System.in);

        System.out.println("명령");
        String cmd = scanner.nextLine().trim();

        System.out.println("1: 입력한 명령: " + cmd);

        System.out.println();

    }

    private static void lab2() {
        // 로봇이 입력을 자동으로 입력받도록 한다.
        // 로봇에게 자동 입력 -> 모니터 출력
        InputStream in = new ByteArrayInputStream("메롱".getBytes());

        Scanner scanner = new Scanner(in);

        System.out.println("명령");
        String cmd = scanner.nextLine().trim();

        System.out.println("2: 입력한 명령: " + cmd);

        System.out.println();

    }

    // 출력 결과를 모니터에 보내주는게 아닌 로봇한테 보내준다.
    private static void lab3() {
        System.out.println("==시작==");

        System.out.println("3: 안녕하세요");

        System.out.println("==끝==");

        System.out.println();


    }

    private static void lab4() {
        System.out.println("==시작==");

        //output 안에 쌓임
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        System.out.println("안녕하세요");

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

        System.out.println("==끝==");

        System.out.println("츨략 : " + output.toString());
        try {
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}