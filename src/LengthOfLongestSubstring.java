public class LengthOfLongestSubstring {

    public int solution(String s) {

        String s1 = new String();
        String s2 = new String();
        int times = 0;
        while (times < s.length()) {
            for (int i = times + 0; i < s.length(); i++) {
                String c = String.valueOf(s.charAt(i));
                if (times == 0 && !s1.contains(c)) {
                    s1 += c;
                } else if (times != 0 && !s2.contains(c)) {
                    s2 += c;
                } else {
                    break;
                }
            }
            s1 = (s1.length() > s2.length()) ? s1 : s2;
            times += 1;
            s2 = "";
        }

        return s1.length();
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring l = new LengthOfLongestSubstring();

        System.out.println(l.solution("jbpnbwwd"));

    }
}
