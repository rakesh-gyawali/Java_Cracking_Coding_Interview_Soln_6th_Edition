/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_and_Strings;

public class OneAway {

    char[] chars;
    int[] table;
    
    //O(N) and space complexity is str1.length + str2.length + 128 + str1.length || str2.length.
    // Space complexity can be reduced to str1.length + str2.length only by modifying checkInsert()...

    public boolean isOneAway(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 2) {
            return false;
        }

        table = new int[128];

        if (str1.length() > str2.length()) {
            return checkInsert(str1, str2);
        } else if (str1.length() < str2.length()) {
            return checkInsert(str2, str1);
        } else if (str1.length() == str2.length()) {
            return oneEditReplace(str1, str2);
        }

        return false;
    }

    private boolean checkInsert(String str1, String str2) {
        int count = str1.length();
        chars = str1.toCharArray();

        for (char ch : chars) {
            table[ch]++;
        }

        for (int i = 0; i < str2.length(); i++) {

            if (table[str2.charAt(i)] > 0) {
                count--;
            }

            table[str2.charAt(i)]--;

            if (table[str2.charAt(i)] < -1) {
                return false;
            }
        }

        if (count > 1) {
            return false;
        }

        return true;
    }

    public static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }
//This is improved method for checkInsert() than above ...
    public boolean improvedMethod(String str1, String str2) {
        int index1 = 0, index2 = 0;
        while (index2 < str2.length() && index2 < str2.length()) {            
            if (str1.charAt(index1) != str2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }
}
