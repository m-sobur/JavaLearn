package leetcode.LengthOfLongestSubstring;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));

    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        if (s.length()==1) return 1;

        int temp = 0;
        StringBuilder sub = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!sub.toString().contains(String.valueOf(s.charAt(i)))) {
                sub.append(s.charAt(i));
            } else {
                if (temp < sub.length()) {
                    temp = sub.length();
                }
                sub.delete(0, sub.indexOf(String.valueOf(s.charAt(i))) + 1);
                sub.append(s.charAt(i));
            }
        }
        if (temp < sub.length()) {
            temp = sub.length();
        }
        return temp;
    }
}
