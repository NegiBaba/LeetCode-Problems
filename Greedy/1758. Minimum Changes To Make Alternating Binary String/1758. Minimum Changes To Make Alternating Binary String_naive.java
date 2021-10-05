class Solution {
    public int minOperations(String s) {
        int first = 0, second = 0;
        for(int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') first++;
                if (s.charAt(i) == '1') second++;
            } else if (i % 2 != 0) {
                if (s.charAt(i) == '1') first++;
                if (s.charAt(i) == '0') second++;
            }
        }
        return Math.min(first, second);
    }
}