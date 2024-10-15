package net.salesianos.replacer;

import java.io.*;

public class Replacer {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            String line = args[0];
            line = line.replaceAll("[AEIOUaeiou]", "x");
            System.out.println(line);
        } else {
            System.err.println("No se encontró nada que cambiar.");
        }
    }
}
