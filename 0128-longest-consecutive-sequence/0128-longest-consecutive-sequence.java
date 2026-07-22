class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        int lastSmall = Integer.MIN_VALUE;
        int longest = 1;
        if(nums.length == 0) return 0;
        for(int i = 0; i < n; i++){
            if((nums[i]-1) == lastSmall){
                count += 1;
                lastSmall = nums[i];
            } 
            else if(nums[i] != lastSmall){
                count = 1;
                lastSmall = nums[i];
            }
            longest = Math.max(count,longest);
        }
        return longest;
        
    }
}