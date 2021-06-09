// naive soltuion
/*
	convert the integer into string and then
	check if the string is palindrome or not
*/
class Solution {
public:
    bool isPalindrome(int x) {
        string s = to_string(x);
        
        if(x < 0) return false;
        int i = 0, j = s.length() - 1;
        while(i < j)
        {
            if(s[i++] != s[j--]) return false;
        }
        return true;
    }
};

// better solution
/*
	reverse half of the integer and
	store the other half, now check
	if both halves are equal,
	BEWARE OF REVERSE HALF BEING ONE DIGIT GREATER THEN FIRST HALF
*/

class Solution {
public:
    bool isPalindrome(int x) {
        
        int rev = 0;
        
        while(rev < x)
        {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        
        if(x == rev || rev / 10 == x) return true;
        return false;
    }
};