class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        
        for (int x : bills) {
            if (x == 5) 
                five++;
            else if (x == 10) {
                if (five == 0) return false;
                else {
                    five--;
                    ten++;
                }
            } else {
                if (ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                }
                else {
                    System.out.println("Herer " + five + " " + ten);
                    return false;
                }
            }
        }
        return true;
    }
}