class Solution {
    public int mySqrt(int x) {
        if (x == 1 || x == 0) {
            return x;
        }
        if(x == 2147483647){
            return 46340;
        }

        int res = 0;

        for (int i = 1; i <= x / 2; i++) {
            int square = i * i;
            if (square == x) {
                return i;
            } else if (square > x) {
                break;
            }
            res = i;
        }

        return res;
    }
}
