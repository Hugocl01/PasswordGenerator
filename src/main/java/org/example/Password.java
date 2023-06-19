package org.example;

public class Password {

    String backlog;
    String password = "";

    public Password(String backlog, int passwordLength) {
        this.backlog = backlog;
        for (int i = 0; i < passwordLength; i++) {
            int randomCharacter = (int) (Math.random() * backlog.length() - 1 + 1);
            password += backlog.charAt(randomCharacter);
        }
    }

    public String getPassword() {
        return password;
    }

}
