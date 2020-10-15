/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays_and_Strings;

/**
 *
 * @author rakes
 */
public class StringCompression {

    public String Compress(String word) {
        int countConsectutive = 0;
        StringBuilder compressed = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            countConsectutive++;
            if (i == word.length() - 1 || word.charAt(i) != word.charAt(i + 1)) {
                compressed.append(word.charAt(i) + String.valueOf(countConsectutive));
                countConsectutive = 0;
            }
        }
        return compressed.toString();
    }
}
