
package Arrays_and_Strings;

public class URLify {
//O(N)
    char[] relpaceSpace(char[] str, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        int indexAfterURLify = trueLength + spaceCount * 2;
        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[indexAfterURLify - 1] = '0';
                str[indexAfterURLify - 2] = '2';
                str[indexAfterURLify - 3] = '%';
                indexAfterURLify = indexAfterURLify - 3;
            } else {
                str[indexAfterURLify - 1] = str[i];
                indexAfterURLify--;
            }
        }
        return str;
    }

}
