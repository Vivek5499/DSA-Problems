class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maj = 0;
        for(int val : nums){
            if(count == 0) maj = val;
            if(val == maj) count++;
            else count--;
        
      }
        return maj;
    }
}