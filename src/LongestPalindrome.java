public class LongestPalindrome {

    /**
     * class Solution {
     public:
     string longestPalindrome(string s) {
     if (s == "")return "";
     int len = s.length();
     int index = 0,maxL=0,begin=0;
     while (index < len) {
     int right = index, left = index;
     while (index < len&&s[index + 1] == s[index]) {
     index++;
     right++;
     }
     while (right < len&&left >= 0 && s[right] == s[left]) {
     right++;
     left--;
     }
     right--, left++;
     if (right-left+ 1 > maxL) {
     maxL = right - left + 1;
     begin = left;
     }
     index++;
     }
     return s.substr(begin, maxL);
     }
     };
     *
     *
     * @param str
     * @return
     */
    public String solution(String str) {

        if (str == null || str.length() == 0) {
            return "";
        }

        int length = str.length();
        int index = 0;
        int maxLength = 0;
        int begin = 0;
        while (index < length) {
            int right = index;
            int left = index;
            while (index < length && str.charAt(index + 1) == str.charAt(index)) {
                index++;
                right++;
            }
            while (right < length && left >= 0 && str.charAt(right) == str.charAt(left)) {
                right++;
                left--;
            }

            right--;
            left++;
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                begin = left;
            }
            index++;

        }
        String substring = str.substring(begin, maxLength);

        return substring;
    }

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.solution("cbbd"));
    }



}
