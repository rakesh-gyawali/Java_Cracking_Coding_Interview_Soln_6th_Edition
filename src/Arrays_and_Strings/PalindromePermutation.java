
package Arrays_and_Strings;

public class PalindromePermutation {
    //Using CharArray ...
    // O(N)
    
    public boolean checkPalinMutation(String str) {
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        int[] ascii = new int['a' - 'z' + 1];
        
        for (char ch : chars) {
            if (ch < 'a' || ch < 'z') {
                ascii[ch]++;
            } 
        }
        int singleCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (ascii[chars[i]] % 2 != 0) {
                singleCount++;
            }

            if (singleCount > 1) {
                return false;
            }
        }
        return true;
    }
}
