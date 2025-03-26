import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean isHappy(int n) {
        return isCheck(n, new HashSet<>());
    }

     public boolean isCheck(int n, Set<Integer> seen){
        if (n == 1) return true;
        if (seen.contains(n)) return false;

        seen.add(n);

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return isCheck(sum, seen);
    }
   
}