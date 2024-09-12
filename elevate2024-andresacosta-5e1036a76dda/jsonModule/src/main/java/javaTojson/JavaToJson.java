package javaTojson;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JavaToJson {

    public static void main(String[] args) {
        Student student = new Student("Mad","Max",20, 100,100);

       try {

            ObjectMapper objectmapper = new ObjectMapper();
            //code below prints it to the terminal as json
//           String jsonString = objecmapper.writeValueAsString(student);
//           System.out.println(jsonString);

           objectmapper.writeValue(new File("C:\\Users\\AndresAcosta\\Documents\\andresacosta\\Student.json"), student);
       }catch (Exception e) {}


    }
}
