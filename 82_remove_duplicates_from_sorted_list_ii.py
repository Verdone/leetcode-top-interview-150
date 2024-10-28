# 82. Remove Duplicates from Sorted List II
# Difficulty: Medium
# Category: Linked List

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        t = ListNode(0)
        t.next = head
        current = t

        while current.next:
            if current.next.next and current.next.val == current.next.next.val:
                val = current.next.val
                while current.next and current.next.val == val:
                    current.next = current.next.next
            else:
                current = current.next

        return t.next 