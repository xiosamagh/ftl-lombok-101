package com.bashl.lombok;

import lombok.Cleanup;
import java.io.*;
import java.util.Random;

public class CleanupExample {
    public static void main(String[] args) throws IOException {

        @Cleanup InputStream in = new FileInputStream("C:\\Java\\prLombok\\src\\main\\resources\\file.txt");
        @Cleanup OutputStream out = new FileOutputStream("C:\\Java\\prLombok\\src\\main\\resources\\file.txt");
        byte[] b = new byte[10000];

            while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }

        System.out.println("Завершено!");
    }
}
