public  class AddTwoNumbers {

    public ListNode solution(ListNode l1, ListNode l2){

        ListNode resultNode = new ListNode(0);
        ListNode inter =resultNode;
        int num = 0;

        while (l1 != null  || l2 != null || num !=0){
            int n1 = l1 != null ? l1.val :0;
            int n2 = l2 != null ? l2.val :0;
            int sum =n1 + n2 + num;
            num = sum /10;

            ListNode listNode = new ListNode(sum % 10);
            inter.next=listNode;
            inter=listNode;

            if (l1!= null) l1=l1.next;
            if (l2 != null) l2=l2.next;

        }




//        StringBuffer stringBuffer1 = new StringBuffer();
//        StringBuffer stringBuffer2 = new StringBuffer();
//        while (l1 != null){
//            stringBuffer1.append(String.valueOf(l1.val));
//            l1=l1.next;
//        }
//        while (l2!= null){
//            stringBuffer2.append(String.valueOf(l2.val));
//            l2=l2.next;
//        }
//        int result =Integer.valueOf(stringBuffer1.reverse().toString()) + Integer.valueOf(stringBuffer2.reverse().toString());
//
//        ListNode resultNode = new ListNode(0);
//        ListNode inter1 = resultNode;
//        while (inter1.next!=null){
//            ListNode inter2 =new ListNode(result%10);
//            inter1.next =inter2;
//            inter1 = inter1.next;
//            result=result/10;
//        }

    return resultNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(0);
        l1.next.next = new ListNode(0);

        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(0);
        l2.next.next = new ListNode(0);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode solution = addTwoNumbers.solution(l1, l2);
        while (solution != null){
            System.out.println(solution.val);
            solution=solution.next;
        }


    }


}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}