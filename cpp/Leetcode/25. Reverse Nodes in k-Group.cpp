//https://leetcode.com/problems/reverse-nodes-in-k-group/

class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
      if(head==NULL)
            return head;
        ListNode *curr = head;
        ListNode *nn = NULL;
        ListNode *prev = NULL;
        int c = 0;
        while(curr!=NULL && c<k){
            curr=curr->next;
            c++;
        }
        if(c<k)
            return head;
        else
        {
            curr = head;
            c=0;
            while(curr!=NULL && c<k){
                nn = curr->next;
                curr->next = prev;
                prev = curr;
                curr=nn;
                c++;
            }
            head->next = reverseKGroup(curr,k);
          
        }
          ListNode *ans = prev;
            return ans;
        
        
    }
};
