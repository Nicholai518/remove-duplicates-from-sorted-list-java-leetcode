public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;

        // while we have a current node and there is a node after
        while (currentNode != null && currentNode.next != null) {

            // because list is sorted, check and see if the values are the same at each node
            if (currentNode.val == currentNode.next.val) {

                // because the numbers are the same, skip over the "next" node
                currentNode.next = currentNode.next.next;
            }

            // there is NOT a duplicate value, the node values are different
            else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
