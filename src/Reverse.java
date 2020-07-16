import java.util.Arrays;

public class Reverse {

    public int solution(int num) {
        int res = 0;
        int inter = 0;
        int result = 0;
        while (num != 0) {
            inter = num % 10;
            result = res * 10 + inter;

            if ((result - inter) / 10 != res) {
                return 0;
            }
            num = num/10;
            res = result;
        }

        return res;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.solution(-100));

    }
}
