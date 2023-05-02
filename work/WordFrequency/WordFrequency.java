package com.gfa.exam.WordFrequency;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordFrequency {
    public static void main(String[] args) {
        getWordFrequency("src/com/gfa/exam/WordFrequency/Resources/input.txt", 2, "src/com/gfa/exam/WordFrequency/Resources/output.txt");
    }

    public static void getWordFrequency(String pathInput, int frequency, String pathOutput) {
        Path filePathInput = Paths.get(pathInput);
        Path filePathOutput = Paths.get(pathOutput);
        List<String> outputLines = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(filePathInput);
            HashMap<String, Integer> countOfWords = new HashMap<>();
            for (int i = 0; i < lines.size(); i++) {
                String stringOfLine = lines.get(i);
                String[] arrOfWords = stringOfLine.split(" ");
                for (int j = 0; j < arrOfWords.length; j++) {
                    if (countOfWords.containsKey(arrOfWords[j])) {
                        countOfWords.put(arrOfWords[j], countOfWords.get(arrOfWords[j]) + 1);
                    } else {
                        countOfWords.put(arrOfWords[j], 1);
                    }
                }
            }
            for (int i = 0; i < lines.size(); i++) {
                String string = lines.get(i);
                String[] arrOfWords = string.split(" ");
                for (int j = 0; j < arrOfWords.length; j++) {
                    if (countOfWords.get(arrOfWords[j]) == frequency) {
                        if (!outputLines.contains(arrOfWords[j])) {
                            outputLines.add(arrOfWords[j]);
                        }
                    }
                }
            }
            Files.write(filePathOutput, outputLines);
        } catch (IOException e) {
            System.out.println("Error happened during file manipulation with the following message: " + e.getMessage());
        }
    }
}
