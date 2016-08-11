
package checkpermutation;

import java.util.Scanner;

/**
 *
 * File Name: checkPermutation.java
 * Description: Given two strings, write a method to decide if one is a permutation of the other
 * Reference: Chapter 1 Cracking the Coding Interview 6th Edition 
 * Author: Amanda Alfaro
 * 
 */

public class checkPermutation {

    static String firstString; //creating string
    static String secondString; //creating string
    
    public static boolean permutationOfOther(){
        if(firstString.equals(secondString)){
            System.out.println("First string eqauls second string");
            return true;
        }
        if(firstString.length() != (secondString.length())){
            System.out.println("The lengths of the strings do not equal");
            return false;
        }
       
        for(int i = 0; i<firstString.length(); i++){
            boolean matchFound = false;
            for(int j = 0; j<secondString.length(); j++){
                if(firstString.charAt(i) == (secondString.charAt(j))){
                    matchFound = true;

                    break;
                }
            }   
            if(!matchFound){
                System.out.println("false");
                return false;
            }
        }
    System.out.println("true");
    return true;
    }
    
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in); //takes in user input
        firstString = cin.next(); //set string equal to the next string
        secondString = cin.next(); //set string equal to the next string
        cin.close();
        permutationOfOther();
    } 
}
