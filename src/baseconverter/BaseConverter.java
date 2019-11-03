/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseconverter;

import java.util.*;

/**
 *Class that handles base conversion.
 * @author samuelliu
 */
public class BaseConverter {
    /**
     * Base n expansion of a number where n > 0.
     */
    private String number;
    
    /**
     * Base of the inputted number.
     */
    private int originalBase;
    
    /**
     * Base the user wants to transform the number into.
     */
    private int transformBase;
    
    /**
     * Map of non-integer values and their integer values. Can only go from 'A'
     * to 'Z'.
     */
    private Map<Character, Integer> nonNumbers;
    
    /**
     * Constructor that initializes instance variables by prompting the user for
     * values for each instance variable.
     */
    public BaseConverter(){
        Scanner in = new Scanner(System.in);
        String number;
        int originalBase = 10;
        int transformBase;
        boolean validInput = false;
        
        //Prompts user for base n representation of a number
        while(!validInput){
            System.out.println("Enter number: ");
            number = in.next();
            if(number.length() > 0){
                validInput = true;
            } else{
                System.out.println("Invalid Input!");
            }
        }
        
        //Prompt users for original base
        validInput = false;
        while(!validInput) {
            System.out.println("Enter Original Base: ");
            originalBase = in.nextInt();
            if(originalBase > 0 && originalBase <= 36){
                validInput = true;
            } else{
                System.out.println("Please input base greater 0 and less than 37");
            }
        }
        
        //Prompts users for base that they want to transform the number into
        validInput = false;
        while(!validInput) {
            System.out.println("Output Base: ");
            transformBase = in.nextInt();
            if(transformBase > 0 && transformBase <= 36){
                validInput = true;
            } else{
                System.out.println("Please input base greater 0 and less than 37");
            }
        }
        
        /**
          *initialize nonNumbers to handle cases where the inputed number contains
          * non-integer values like 'A' or 'Z'
          */
        nonNumbers = new HashMap<>();
        for(int i = 'A'; i <= 'Z'; i++){
            nonNumbers.put((char)i, i - 55);
        }
        System.out.println("Value of A: " + nonNumbers.get('Z'));
    }
    /**
     * This method will do the base conversions
     * @param number a string of numbers and letters that represents the number 
     * we are converting
     * @param origBase original base of number
     * @param tranBase base that we want to transform the number into
     * @return representation of the number in the base we are transforming to
     */
    public static String baseConverter(String number, int origBase, int tranBase){
        for(int i = 0; i < number.length(); i++){
            
        }
        return "";
    }
    
    
}
