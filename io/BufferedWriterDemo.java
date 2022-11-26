package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        String content = "Hi there, i am Kiptoo!";

        try (FileWriter writer = new FileWriter("kip.txt");
             BufferedWriter bw = new BufferedWriter(writer)) {
                bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
