# 19. Remove Nth Node From End of List
# Difficulty: Medium
# Category: Linked List

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        def removeNode(node, n):
            if not node:
                return 0
            cnt = removeNode(node.next, n)
            if cnt == n:
                node.next = node.next.next
            return cnt + 1
    
        return head.next if removeNode(head, n) == n else head