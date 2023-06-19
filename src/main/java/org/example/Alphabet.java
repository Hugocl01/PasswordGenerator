package org.example;

public class Alphabet {

    public final String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public final String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    public final String numbers = "1234567890";
    public final String symbols = "!@#$%^&*()-_=+\\\\/~?";

    public StringBuilder characters;

    public Alphabet(boolean onlyLetters, boolean symbolsNumbers) {
        characters = new StringBuilder();
        if (onlyLetters && !symbolsNumbers) {
            characters.append(upperCaseLetters);
            characters.append(lowerCaseLetters);
        }
        if (!onlyLetters && symbolsNumbers) {
            characters.append(numbers);
            characters.append(symbols);
        }
        if (onlyLetters && symbolsNumbers) {
            characters.append(upperCaseLetters);
            characters.append(lowerCaseLetters);
            characters.append(numbers);
            characters.append(symbols);
        }
    }

    public String getCharacters() {
        return characters.toString();
    }
}

