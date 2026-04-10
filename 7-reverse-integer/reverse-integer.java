class Solution {
    public int reverse(int x) {
        int rev_No = 0;
        while(x != 0){
            int last_dig = x % 10;
            if(rev_No > Integer.MAX_VALUE / 10 ||
            rev_No < Integer.MIN_VALUE / 10)
            {
                return 0;
            }
            rev_No = (rev_No * 10) + last_dig;
            x = x / 10;
        }
        return rev_No;
    }
}