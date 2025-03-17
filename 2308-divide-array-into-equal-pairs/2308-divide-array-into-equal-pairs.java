class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        int count=1;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(!hash.containsKey(nums[i])){
                hash.put(nums[i],count);
            } else {
                hash.put(nums[i], hash.get(nums[i])+1);
            }
        }

        for (Integer i : hash.keySet()) {
            if(hash.get(i) %2 ==0){
                flag = true;
            } else {
                return false;
            }
}

    return flag;       
    }
}