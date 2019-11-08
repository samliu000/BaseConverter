/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseconverter;

import java.util.*;
import java.math.*;

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
     * Map of characters and their values
     */
    private Map<Character, Integer> numVals;
    
    private Map<Integer, Character> valOfNums;
    
    /**
     * Constructor that initializes instance variables by prompting the user for
     * values for each instance variable.
     */
    public BaseConverter(){
        Scanner in = new Scanner(System.in);
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
          *initialize numVals to assign each character from 1-9 and 'A'-'Z' a value
          */
        numVals = new HashMap<>();
        valOfNums = new HashMap<>();
        for(int i = 'A'; i <= 'Z'; i++) {
            numVals.put((char)i, i - 55);
        }
        for(int j = 0; j < 10; j++) {
            numVals.put((char)(j+48), j);
        }
        for(int i = 0; i < 10; i++) {
            valOfNums.put(i, (char)(i + 48));
        }
        for(int k = 10; k < 36; k++) {
            valOfNums.put(k, (char)(k + 55));
        }
    }
    
    /**
     * A getter method for the transformBase instance variable
     * @return the value that represents the base that the user wants to transform to
     */
    public int getRequestedBase(){
        return transformBase;
    }
    
    /**
     * This method will do the base conversions
     * @return representation of the number in the base we are transforming to
     */
    public String baseConverter(){
        //Convert to decimal first
        int decimalRepresentation = 0;
        for(int i = 0; i < number.length(); i++){
            int valueOfIndex = numVals.get(number.charAt(i));
            decimalRepresentation += valueOfIndex * Math.pow(originalBase, number.length()-1-i);
        }
        
        //convert from decimal to requested base
        int copyOfDecimalRepresentation = decimalRepresentation;
        Stack<Character> baseNRepresentation = new Stack<>();
        while(copyOfDecimalRepresentation != 0){
            char remainder = valOfNums.get(copyOfDecimalRepresentation%transformBase);
            baseNRepresentation.add(remainder);
            copyOfDecimalRepresentation = copyOfDecimalRepresentation / transformBase;
        }
        
        
        String requestedRepresentation = "";
        while(!baseNRepresentation.empty()){
            requestedRepresentation += baseNRepresentation.pop();
        }

        return requestedRepresentation;
    }
    
    
}
