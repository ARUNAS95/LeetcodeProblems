import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        String a = "";
        for (int i=0;i<digits.length;i++){
            a += digits[i];
        }
        BigInteger stringToInt = new BigInteger(a);
        BigInteger one = BigInteger.ONE;
        BigInteger finalResult = stringToInt.add(one);
        a =finalResult.toString();

        int [] result = new int[a.length()];
        
        for(int i=0;i<a.length(); i++){
            result[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
        }
     
        return result;
        
    }
}