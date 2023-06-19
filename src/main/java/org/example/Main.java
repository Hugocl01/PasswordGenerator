package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Alphabet characters = null;
        int opc = Statics.opcMenu();
        switch (opc) {
            case 1 -> {
                characters = new Alphabet(true, false);
            }
            case 2 -> {
                characters = new Alphabet(false, true);
            }
            case 3 -> {
                characters = new Alphabet(true, true);
            }
            case 4 -> {
                System.out.println("You have exited the program");
            }
        }
        String backlog = characters.getCharacters();
        Password password = new Password(backlog, Statics.passwordLength());

    }

}