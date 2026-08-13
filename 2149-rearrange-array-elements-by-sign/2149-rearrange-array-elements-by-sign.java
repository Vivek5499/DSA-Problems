class Solution {
    public int[] rearrangeArray(int[] nums) {
         int posindex = 0;
         int negindex = 1;
         int n = nums.length;
         int[] res = new int[n];
         for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                res[posindex] = nums[i];
                posindex += 2;
            }
            else{
                res[negindex] = nums[i];
                negindex += 2;
            }
         }

        return res;
        
    }
}