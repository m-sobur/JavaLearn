package leetcode.LongestPalindromicSubstring;

// TODO: 10/11/2023
/*Given a string s, return the longestpalindromicsubstringin s.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters.*/

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        String palendrom = "12321";
        System.out.println(longestPalindrome(s));

        //System.out.println(isPalindrome(palendrom));
    }

    public static String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int maxLen = 1;
        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

}
