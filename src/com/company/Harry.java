

package com.company;
/*
@USER: Java02
@DATE: 06.03.2021
@NAME: Harry
*/

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Harry {
    public static String loadText(String fileLocation) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(fileLocation)));
        return content;
    }
    public static String cleanGerbedge (String text){
        text = text.replaceAll("[^A-Za-z ]", "").toLowerCase();
        return text;
    }
    public static void main(String[] args) throws IOException {
        String fileLocation = "C:\\Users\\Java02\\Downloads\\harry2.txt";
        String text =loadText(fileLocation);
        text = cleanGerbedge(text);
        String [] array = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            //System.out.print(array[i]);
        }
        //System.out.println(text.length());
        //System.out.println(array.length);
        String distingWords = "";
        for (int i = 0; i < array.length; i++) {
            if (!distingWords.contains(array[i])){
                distingWords += array[i]+ " ";
            }
        }
        array = distingWords.split(" ");
        for (int i = array.length -10; i < array.length; i++) {
            //System.out.println(array[i] + " ");
        }
        System.out.println(array.length);
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
            if (i % 10 == 0) System.out.println();
        }
    }
}
