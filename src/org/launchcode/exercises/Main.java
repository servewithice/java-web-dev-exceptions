package org.launchcode.exercises;

import org.launchcode.Temperature.TemperatureException;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Divide (4, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

//        for (String file : studentFiles.values()) {
//            CheckFileExtension(file);
//        }

        for (Map.Entry<String, String> student : studentFiles.entrySet()) {
            int points = CheckFileExtension(student.getValue());
            if (points == -1) {
                System.out.println(student.getKey() + " did not submit a file.");
            } else if (points == 0) {
                System.out.println(student.getKey() + " did not submit the correct file type.");
            }
        }
    }

    public static int Divide(int x, int y)
    {
        if (y == 0) {
            try {
                throw new ArithmeticException("You cannot divide by zero, it will create a black hole!");
            } catch (ArithmeticException e){
                e.printStackTrace();
            }
        }
        return (x / y);
    }

    public static int CheckFileExtension(String fileName)
    {
        int points = 0;
        if (fileName.contains(".java")) {
            points++;
        } else if (fileName == null || fileName == "") {
            try {
                throw new IllegalArgumentException("No file name specified!");
            } catch (IllegalArgumentException e){
                e.printStackTrace();
            }
            points--;
        }
        return points;
    }

}
