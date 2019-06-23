/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04pc06;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author frank.olson
 * date 11/8/2017
 * purpose: to count the number of letters in a name in a file.
 */
public class Ch04pc06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //variables
        String countName, fileName;
        char letter, temp;
        int i, charCount = 0;
        
        
        //create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Request input
        System.out.print("Please enter the name of the file: ");
        fileName = keyboard.nextLine();
        System.out.print("Please enter a character to count: ");
        letter = keyboard.next().charAt(0);
        
        //Open the file
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        
        //Read the first line of the file
        countName = inputFile.nextLine();
        
        //Calculations and output
        for (i = 0; i < countName.length(); i++)
        {
            temp = countName.charAt(i);
            
            if(temp == letter)
                charCount++;
        }
        System.out.println("There are " + charCount + " instances of letter " + letter + " in the word " + countName + ".");
        
        //Close the file
        inputFile.close();
    }
    
}
