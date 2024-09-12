package filehandlingLab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputOutput {

    public static void main(String[] args) {
        String line;
        int count = 0;
        Path filePath = Paths.get("C:\\Users\\AndresAcosta\\files\\Alice.txt");


        try(BufferedReader reader = Files.newBufferedReader(filePath)){

            while((line = reader.readLine()) != null) { //reader.readLine() reads the file once and is saved to line, issue before was reader was only reading it once outside of the loop so when the loop came there were no lines to read.
                //Splits each line into words
                System.out.println(line);
                String words[] = line.split("");
                //Counts each word
                 count += words.length;

            }
            System.out.println("Number of words present in given file: " + count);

        }


        catch(IOException e){
            System.err.println("Error reading file: " + e.getMessage());


        }




    }



}
