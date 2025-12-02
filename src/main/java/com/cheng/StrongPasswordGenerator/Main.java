package com.cheng.StrongPasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        while (true)
        {
            System.out.println("请输入要生成多少位的密码");
            int length = sc.nextInt();
            StringBuilder password = new StringBuilder("");
            for (int i = 0; i < length; i++)
            {
                int tempChar = rand.nextInt(94) + 33;
                password.append((char) tempChar);
            }
            System.out.println("强密码生成完成");
            System.out.println(password.toString());
        }

    }
}