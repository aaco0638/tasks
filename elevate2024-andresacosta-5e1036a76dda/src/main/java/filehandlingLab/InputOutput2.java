package filehandlingLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class InputOutput2 {

    public static void main(String[] args) {
        String targetWord = "half";
        String filePath = "C:\\Users\\AndresAcosta\\files\\Alice.txt";
        Map<String, Integer> wordFrequency = calculateWordFrequency(filePath, targetWord);


        if (wordFrequency != null) {
            System.out.println(wordFrequency);
            }


        }


    public static Map<String, Integer>  calculateWordFrequency(String filePath, String targetWord) {

        String line;


        Path path = Paths.get(filePath);
        Map<String, Integer> wordFrequency = new HashMap<>();
        wordFrequency.put(targetWord, 0);
        try (BufferedReader reader = Files.newBufferedReader(path)) {

            while ((line = reader.readLine()) != null) {
                //Splits each line into words
                System.out.println(line);
                String[] words = line.trim().toLowerCase().split("\\s+");
                //Counts each word
                for (String word : words) {

                    if (word.toLowerCase().equals(targetWord.toLowerCase())){
                        wordFrequency.put(targetWord, wordFrequency.get(targetWord) + 1);

                    }


                }

            }
        }


             catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;



        }


        return wordFrequency;
    }


}
