/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseconverter;

import java.util.*;

/**
 *Class that handles base conversion
 * @author samuelliu
 */
public class BaseConverter {
    /**
     * Base n expansion of a number where n > 0
     */
    private String number;
    
    /**
     * 
     */
    private int originalBase;
    private int transformBase;
    private Map<Character, Integer> nonNumbers;
    
    /**
     * Constructor that initializes instance variables by prompting the user for
     * values for each instance variable
     */
    public BaseConverter(){
        Scanner in = new Scanner(System.in);
        String number;
        int originalBase = 10;
        int transformBase;
        boolean validInput = false;

        System.out.println("Enter number: ");
        number = in.next();
        
        while(!validInput) {
            System.out.println("Enter Original Base: ");
            originalBase = in.nextInt();
            if(originalBase > 0 && originalBase <= 36){
                validInput = true;
            } else{
                System.out.println("Please input base greater 0 and less than 37");
            }
        }
        System.out.println("Output Base: ");
        transformBase = in.nextInt();
        
        /**
          *initialize nonNumbers to handle cases where the inputed number contains
          * non-integer values like 'A' or 'Z'
          */
        nonNumbers = new HashMap<>();
        for(int i = 'A'; i <= 'Z'; i++){
            nonNumbers.put((char)i, i - 55);
        }
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
