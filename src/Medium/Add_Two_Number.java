package Medium;

class ListNode {
    int val;
    ListNode next;

    ListNode(){
        val = 0;
        next = null;
    }

    ListNode(int val){
        this.val = val;
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class Add_Two_Number {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        ListNode l = addTwoNumbers(l1, l2);
        System.out.print("[");
        while (l.next != null){
            System.out.print(l.val + ",");
            l = l.next;
        }
        System.out.println(l.val + "]");
        l = null;

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Fix: Kiểm tra null an toàn
        if (l1 == null && l2 == null) {
            return new ListNode(0);
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        // Duyệt cả hai list cùng lúc
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }
}
