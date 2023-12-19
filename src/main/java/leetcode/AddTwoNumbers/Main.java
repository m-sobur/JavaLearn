package leetcode.AddTwoNumbers;


import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        ListNode test1 = new ListNode(3);
        ListNode test2 = new ListNode(4, test1);
        ListNode test3 = new ListNode(2, test2);

        String a = "blabla";
        a.length();

        System.out.println(listNodeToInt(test3));

        ListNode test10 = new ListNode(4);
        ListNode test20 = new ListNode(6, test10);
        ListNode test30 = new ListNode(5, test20);

        System.out.println(listNodeToInt(test30));


        System.out.println(listNodeToInt(addTwoNumbers(test3, test30)));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger sum = listNodeToInt(l1).add(listNodeToInt(l2));

        return intToListNode(sum);
    }

    private static ListNode intToListNode(BigInteger sum) {
        StringBuilder sb = new StringBuilder();
        sb.append(sum);

        ListNode result = null;
        for (int i = 0; i < sb.length(); i++) {
            result = new ListNode(Integer.parseInt(String.valueOf(sb.charAt(i))),result);
        }
        return result;
    }


    public static BigInteger listNodeToInt(ListNode listNode) {
        StringBuilder sb = new StringBuilder();
        while (listNode != null) {
            sb.append(listNode.val);

            if (listNode.next != null) {
                listNode = listNode.next;
            } else {
                listNode = null;
            }
        }

        String reverse = sb.reverse().toString();
        return new BigInteger(reverse);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }*/
