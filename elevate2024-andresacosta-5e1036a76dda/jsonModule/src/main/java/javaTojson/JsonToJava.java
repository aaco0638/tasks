package javaTojson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {

    public static void main(String[] args) {

        String input = "{\"type\":\"Cat\",\"name\":\"fluffles\",\"age\":3}";

        ObjectMapper objectMapper = new ObjectMapper();

        try{
            Animal animal = objectMapper.readValue(input, Animal.class);

            System.out.println("Type: " + animal.getType());
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());

        }
        catch(Exception e){
            e.printStackTrace();

        }


    }


}
