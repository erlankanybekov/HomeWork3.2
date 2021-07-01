package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String [] names = new String[4];
        names [0] = "Erlan";
        names [1] = "Beka";
        names [2] = "Mirlan";
        Scanner newnames = new Scanner(System.in);
        System.out.println("добавьте 4-ый элемент:" );
        names[3] = newnames.nextLine();

        for (String newname:names)
            switch (newname){
                case "Erlan":
                    System.out.println("Доброе утро "+ names[0]);
                    break;
                case "Beka":
                    System.out.println("Добрый день "+ names[1]);
                    break;
                case "Mirlan":
                    System.out.println("Добрый вечер "+ names[2]);
                    break;
                case "Meerim":
                    System.out.println("Доброй ночи "+ names[3]);
                    break;
            }
        for (int i = 0; i < names.length ; i++) {
            System.out.println("Здравствуйте "+ names[i]);

        }

    }

}
