
package Arrays_and_Strings;

//Check Permutation: Given two strings, write a method to decide if one is a permutation of the other. 
public class CheckPermutation {

    boolean flag;

//O(N^2) --> Comparing Each Char --> Too slow ...
    public boolean check(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        for (int i = 0; i < first.length(); i++) {
            if (i != 0 && !flag) {
                return false;
            }
            flag = false;
            for (int j = 0; j < second.length(); j++) {
                if (first.charAt(i) == second.charAt(j) || flag) {
                    flag = true;
                    break;
                }
            }
        }
        return true;
    }

//O(N * logN) --> Sorting array and comparing --> Still there is better way ...
    public boolean checkOptimized(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        return Sort(first).equals(Sort(second));
    }

    private String Sort(String str) {
        char[] arr = str.toCharArray();
        java.util.Arrays.sort(arr); //sort arr
        return new String(arr); //Convert charArr into String ...

    }

//O(N) --> Counting each character --> Best way ...
    public boolean checkBest(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        int[] letters = new int[128];
        char[] arr = first.toCharArray();
        for (char ch : arr) {
            letters[ch]++; //automatically converted to int ...
        }

        for (int i = 0; i < first.length(); i++) {
            int ch = second.charAt(i);
            letters[ch]--;

            if (ch < 0) {
                return false;
            }
        }
        return true;
    }
}
