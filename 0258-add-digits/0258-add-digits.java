class Solution {
    public int addDigits(int num) {
        if(num <10){
            return num;
        } else{
            int temp = num;
            int sum = 0;
            while(num>0){
                temp  = num%10;
                sum = sum + temp;
                num = num/10; 
            }
            return addDigits(sum);
        }
    }
}