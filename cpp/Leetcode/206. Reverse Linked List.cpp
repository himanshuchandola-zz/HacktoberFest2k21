//https://leetcode.com/problems/reverse-linked-list/
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        
        ListNode* current=head;
        ListNode* prev=NULL;
        ListNode* nn;
        
        while(current!=NULL)
        {
            nn=current->next;
            current->next=prev;
            prev=current;
            current=nn;
        }
        return prev;
        
        
    }
};
