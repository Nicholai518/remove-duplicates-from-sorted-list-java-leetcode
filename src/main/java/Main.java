public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode exampleOneHead = new ListNode(1);
        ListNode exampleOneNodeTwo = new ListNode(1);
        ListNode exampleOneNodeThree = new ListNode(2);
        exampleOneHead.next = exampleOneNodeTwo;
        exampleOneNodeTwo.next = exampleOneNodeThree;

        ListNode exampleTwoHead = new ListNode(1);
        ListNode exampleTwoNodeTwo = new ListNode(1);
        ListNode exampleTwoNodeThree = new ListNode(2);
        ListNode exampleTwoNodeFour = new ListNode(3);
        ListNode exampleTwoNodeFive = new ListNode(3);
        exampleTwoHead.next = exampleTwoNodeTwo;
        exampleTwoNodeTwo.next = exampleTwoNodeThree;
        exampleTwoNodeThree.next = exampleTwoNodeFour;
        exampleTwoNodeFour.next = exampleTwoNodeFive;

        System.out.println("Example One : ");
        ListNode currentNode = solution.deleteDuplicates(exampleOneHead);
        while (currentNode != null) {
            System.out.print(currentNode.val);
            currentNode = currentNode.next;
        }
        System.out.println();

        System.out.println("Example Two : ");
        currentNode = solution.deleteDuplicates(exampleTwoHead);
        while (currentNode != null) {
            System.out.print(currentNode.val);
            currentNode = currentNode.next;
        }

    }
}
