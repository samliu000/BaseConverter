/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseconverter;
import java.util.*;
/**
 *
 * @author samuelliu
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseConverter baseConversion = new BaseConverter();
        System.out.println("Base " + baseConversion.getRequestedBase() + ": " + baseConversion.baseConverter());
    }
}
