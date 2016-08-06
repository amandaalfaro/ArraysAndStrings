package isunique;
import java.util.*;
/**
 *
 * File Name: isUnique.java
 * Description: Implement an algorithm to determine if a string has all unique characters
 * Restriction(s): What if you cannot use additional data structure
 * Reference Chapter 1 Cracking the Coding Interview
 * Author: Amanda Alfaro
 * 
 */
public class IsUnique {

    static String helloString; 
    static Hashtable hashUnique = new Hashtable();
   
    /**
     * Checks to see if hashtable contains the character in the string
    */
    
    public static boolean checkingUnique(){
        for(int i = 0; i < helloString.length(); i++){
            if(hashUnique.contains(helloString.charAt(i))){
                      System.out.println("This string does not contain unique charatcers. ");

                return false;
            }
            else{
              // putting the character into the hashtable
              hashUnique.put(i, helloString.charAt(i)); //(key, value) parameters: key - the hashtable; key value - the value individual characters in string 
            }
        }
      System.out.println("This string contains unique charatcers. ");
      return true;
    }
    public static void main(String[] args) {        
        Scanner cin = new Scanner(System.in); //takes in user input
        helloString = cin.next(); //set string equal to the next string
        cin.close();
        //cin.next() returns the next string 
        
       checkingUnique();
    }
    
}
