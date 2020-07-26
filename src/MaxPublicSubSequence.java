public class MaxPublicSubSequence {
    public String soultion(String str1, String str2) {

        //非空判断
        if (str1==null ||str2 ==null) return  null;
        if (str1.equals("") ||str2.equals("")) return  null;

        //长短位置调整
        String inter ="";
        if (str2.length()>str1.length()){
            inter = str1;
            str1 = str2;
            str2 =inter;
        }

        String current ="";
        for (int i=0;i<str2.length();i++){
            for (int begin=0,end = str2.length()-i;end<=str2.length();begin++,end++){

                current =str2.substring(begin,end);
                if (str1.contains(current)){
                    return current;
                }
            }
        }


        return null;
    }

    public static void main(String[] args) {
        String strOne = "abcdefg";
        String strTwo = "adefgwgeweg";
        MaxPublicSubSequence maxPublicSubSequence = new MaxPublicSubSequence();
        System.out.println(maxPublicSubSequence.soultion(strOne,strTwo));
    }
}
