package com.epam.oopintro;

import java.util.Scanner;

/**
 * Приветствовать любого пользователя
 * при вводе его имени через команд-
 * ную строку.
 */

public class A1_ConsolInvitation {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Приветствую, "+name + "!");

    }

}
