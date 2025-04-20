class Solution {

    static Map<Integer, Integer> memo = new HashMap<>();
    public static int climbStairs(int n) {
        
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n<=1){
            return 1;
        }
       

        int result= climbStairs(n-1)+ climbStairs(n-2);
        memo.put(n,result);

         return result;
    }
}