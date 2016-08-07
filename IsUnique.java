package isunique;
import java.util.*;
/**
 *
 * File Name: isUnique.java
 * Description: Implement an algorithm to determine if a string has all unique characters
 * Reference: Chapter 1 Cracking the Coding Interview 6th Edition 
 * Author: Amanda Alfaro
 * 
 */
public class IsUnique {

    static String helloString; //creating string
    static Hashtable hashUnique = new Hashtable(); //creating hashtable
   
    /**
    Checks to see if hashtable contains the character in the string
    if the hashtable "hashUnique" contains the character value 
    at the specified index of helloString, then the character of 
    the string is in the hashtable already meaning the string does 
    not contain unique characters
    .charAt(i): Returns the char value at the specified index.
    */
    
    public static boolean checkingUnique(){
        for(int i = 0; i < helloString.length(); i++){
            if(hashUnique.contains(helloString.charAt(i))){
                System.out.println(helloString + " does not contain unique charatcers. ");
                return false;
            }
            else{
                // putting the character that is not currently in the hashtable into the hashtable
                hashUnique.put(i, helloString.charAt(i)); //(key, value) parameters: key - the hashtable; key value - the value individual characters in string 
            }
        }
        System.out.println(helloString + " contains unique charatcers. "); 
        return true;
    }
    public static void main(String[] args) {        
        Scanner cin = new Scanner(System.in); //takes in user input
        helloString = cin.next(); //set string equal to the next string
        cin.close();
        checkingUnique(); //calling method
    }
    
}
