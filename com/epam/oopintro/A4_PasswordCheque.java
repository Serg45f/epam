package com.epam.oopintro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A4_PasswordCheque {

    public static void main(String[] args) {

        final String PASSWORD = "12345";

        while (true) {
             //if(chequePasswordTry(PASSWORD)) break;
            if(chequePasswordIf(PASSWORD)) break;
        }
    }

    public static boolean chequePasswordTry(String PASSWORD){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        try {
            String password = scanner.next(PASSWORD);
            System.out.println("Пароль введен верно (" + password + ")");
            return true;
        } catch (InputMismatchException e) {
            System.out.println("Пароль неверен.");
            return false;
        }
    }
    public static boolean chequePasswordIf(String PASSWORD){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите пароль: ");
        String password = scanner.next();
        if(PASSWORD.equals(password)){
            System.out.println("Пароль введен верно (" + password + ")");
            return true;
        }else{
            System.out.println("Пароль неверен. (" + password + ")");
            return false;
        }
    }
}
