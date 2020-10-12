package Arrays_and_Strings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rakes
 */

//Is Unique: Implement an algorithm to determine if a string has all
//unique characters. What if you cannot use additional data structures? 
public class IsUnique {
    
    public boolean CheckString(String stringToBeChecked) {
        if (stringToBeChecked.length() > 128 || stringToBeChecked.length() < 0) {
            return false;
        }
        boolean [] arr = new boolean [128];

        for (int i = 0; i < stringToBeChecked.length(); i++) {
            int ascii = stringToBeChecked.charAt(i);
            if (arr[ascii]) {
                return false;
            }
            arr[ascii] = true;
        }
        return true; 
    }
}
