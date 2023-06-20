package org.example;

public class Main {
    public static void main(String[] args) {
        int opc = 0;
        boolean onlyLetters = false;
        boolean symbolsNumbers = false;
        do {
            opc = Statics.opcMenu();
            switch (opc) {
                case 1 -> {
                    onlyLetters = true;
                    symbolsNumbers = false;
                }
                case 2 -> {
                    onlyLetters = false;
                    symbolsNumbers = true;
                }
                case 3 -> {
                    onlyLetters = true;
                    symbolsNumbers = true;
                }
                case 4 -> {
                    System.out.println("You have exited the program");
                }
            }
            if (opc != 4) {
                Alphabet characters = new Alphabet(onlyLetters, symbolsNumbers);
                String backlog = characters.getCharacters();
                Password password = new Password(backlog, Statics.passwordLength());
                System.out.println("Your password:\n" + password.getPassword() + "\n");
            }
        } while (opc != 4);

    }
}