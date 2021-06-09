/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode *first = l1;
        ListNode *second = l2;
        
        // for the first node
        int carry = 0;
        int x = first->val + second->val;
        if(x > 9) 
        {
            carry = x / 10;
            x %= 10;
        }
        
        ListNode *ans = new ListNode(x);
        first = first->next;
        second = second->next;
        ListNode *curr = ans;
        
        while(first != NULL && second != NULL)
        {
            x = first->val + second->val + carry;
            
            if(x > 9)
            {
                carry = x / 10;
                x = x % 10;
            }
            else carry = 0;
            ListNode *temp = new ListNode(x);
            curr->next = temp;
            curr = curr->next;
            
            // ek aur step aage jana
            first = first->next;
            second = second->next;
        }
        
        while(first != NULL)
        {
            x = carry + first->val;
            
            if(x > 9)
            {
                carry = x / 10;
                x %= 10;
            }
            else carry = 0;
            ListNode *temp = new ListNode(x);
            curr->next = temp;
            curr = curr->next;
            first = first->next;
        }
        while(second != NULL)
        {
            x = carry + second->val;
            
            if(x > 9)
            {
                carry = x / 10;
                x %= 10;
            } else carry = 0;
            ListNode *temp = new ListNode(x);
            curr->next = temp;
            curr = curr->next;
            second = second->next;
        }
        if(carry > 0) 
        {
            ListNode *temp = new ListNode(carry);
            curr->next = temp;
        }
        return ans;
    }
};