package urlify;
import java.util.*;
/**
 *
 * File Name: URLify.java
 * Description: Write a method to replace all spaces in a string with '%20' You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string 
 * Note: When implementing in java, please use a character array so that you can perform this operation in place
 * Reference: Chapter 1 Cracking the Coding Interview 6th Edition 
 * Author: Amanda Alfaro
 * 
 */

public class URLify {
    static String charString;
    static int totalCharacters;
    
    public static String replaceSpace(){
    /**
    * 
    * Determines if the specified character is white space according to Java
    * ch - the character to be tested
    * Returns:true if the character is a Java whitespace character; false otherwise
    * 
    */
        String newString = ""; 

        for(int i = 0; i < totalCharacters; i++){ //start from the last character in the true length of the string
            if(Character.isWhitespace(charString.charAt(i))){
                newString += "%20";
            }else{
                newString += charString.charAt(i); //add to new string
            }
        }
        return newString;
    }
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        
        System.out.print("Enter a string ");
        charString = cin.nextLine();
        
        System.out.print("How many characters are in that string? ");
        totalCharacters = cin.nextInt();

        cin.close();
        
        System.out.println(replaceSpace());
        
    }  
}
