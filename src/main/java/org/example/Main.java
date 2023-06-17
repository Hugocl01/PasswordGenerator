package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        File fichero = new File("C:\\Users\\hugoc\\Desktop\\Contraseña.txt");
        int longitud = introNum();
        BufferedWriter br = null;
        String contrasena = password(longitud);
        try {
            br = new BufferedWriter(new FileWriter(fichero));
            br.write(contrasena);
            br.write(System.lineSeparator());
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
        System.out.println("Contraseña creada en el escritorio");
    }

    public static String password(int num) {
        String cadena = "";
        String caracteres = "qQwWeErRtTyYuUiIoOpPaAsSdDfFgGhHjJkKlLzZxXcCvVbBnNmM1234567890!|#~%&¬/()='?¡¿^+*-_<>";
        for (int i = 0; i < num; i++) {
            int randomCara = (int) (Math.random() * caracteres.length() - 1 + 1);
            cadena += caracteres.charAt(randomCara);
        }
        return cadena;
    }

    public static int introNum() {
        System.out.println("Introduce la logitud de la contraseña que quieres generar:");
        return new Scanner(System.in).nextInt();
    }

}