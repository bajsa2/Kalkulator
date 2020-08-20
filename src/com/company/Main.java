package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int firstNumber;
        int secoundNumber;
        int choice;


        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);
        Scanner result = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe:");
        firstNumber = number1.nextInt();
        System.out.println("Podaj druga liczbe:");
        secoundNumber = number2.nextInt();
        System.out.println("Wybierz dzialanie");
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Mnozenie");
        System.out.println("4.Dzielenie");
        choice = result.nextInt();

        switch (choice) {
            case 1:
                if (choice == 1)
                    System.out.println("Wynik dodawania to = " + (firstNumber + secoundNumber));


            case 2:
                if (choice == 2)
                    System.out.println("Wynik odejmowania to = " + (firstNumber - secoundNumber));


            case 3:
                if (choice == 3)
                    System.out.println("Wynik mnozenia to = " + (firstNumber * secoundNumber));


            case 4:
                if (choice == 4)
                    System.out.println("Wynik dzielenia to = " + (firstNumber / secoundNumber));




      }
    }
}
