package com.example.yazmaveokuma;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class main {


    public static void main(String args[]){
        
        write();
        read();

    }


    public static void write(){
        try {//We have to use try and catch to use writing

            File file = new File("D:\\fileeee.txt");

            if(!file.exists()){ //if file doesn't exist in the current path, We create the file
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);

            BufferedWriter writer = new BufferedWriter(fw); //BufferedWriter is great for performance

            writer.write("Bla bla and bla "); //Write here anything you want to write

            writer.flush();

            writer.close();



        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void read(){
        try {

            File dosya = new File("D:\\fileeee.txt");

            FileReader fr = new FileReader(dosya);

            BufferedReader okuyucu = new BufferedReader(fr);

            StringBuilder sb = new StringBuilder(); //The reason why we use StringBuilder object is to read every letter one by one
            //And combine all of them after

            String line = "";

            while ((line = okuyucu.readLine()) != null){//Whenever a letter doesn't equal null, run the while loop
                sb.append(line + "\n");//And add it to the "line" string. In the end when we finish to read all of the word, the loop is over
            }

            okuyucu.close();

            System.out.println(sb.toString());//We show the text which we read


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
