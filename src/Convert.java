public class Convert {
    /**
     * 0     6      12        18
     1   5 7   11 13    17
     2 4   8 10   14 16
     3     9      15

     对于n行的, s中的第i个字符：

     对余数进行判断

     i%(2n-2) == 0 ----> row0

     i%(2n-2) == 1 & 2n-2-1 ----> row1

     i%(2n-2) == 2 & 2n-2-2 ----> row2

     ...

     i%(2n-2) == n-1 ----> row(n-1)

     ==>

     对 k = i%(2n-2)进行判断

     k<=n-1时候，s[i]就属于第k行
     k>n-1时候，s[i]就属于2n-2-k行

     * @param s
     * @param numRows
     * @return
     */
    public String solution(String s, int numRows) {

        if (s.isEmpty() || numRows < 1) return s;
        int n = s.length();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < n; j += (numRows - 1) * 2) {

            }
        }

        return "";
    }
}
