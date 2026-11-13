class Solution {
    public int longestSubarray(int[] nums) {
        int s=0;
        int e=0;
        int max=0;
     for(int r = 0; r<nums.length; r++){
        if(nums[r]==0){
            e++;
        }
        while(e > 1){
            if(nums[s] == 0){
                e--;
            }
            s++;
        }
        max = Math.max(max, r - s);
     }
     return max;
        }
    }
