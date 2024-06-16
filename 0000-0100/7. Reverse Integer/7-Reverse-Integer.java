class Solution {
    public int reverse(int x) {
        int num = 0;
        while(x != 0){
            int ost = x%10;

            if(num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && ost > 7))
                return 0;
            if(num < Integer.MIN_VALUE/10 || (num == Integer.MIN_VALUE/10 && ost > 8))
                return 0;

            num = num*10 + ost;
            x/=10;
        }
        return num;
    }
}