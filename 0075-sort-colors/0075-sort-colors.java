class Solution {
    public void sortColors(int[] nums) {
   for(int i=0; i<nums.length; i++){
            int min = nums[i];
            int mi = i;
            for(int j=i; j<nums.length; j++){
                if(nums[j]< min){
                    min=nums[j];
                    mi =j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[mi];
            nums[mi] = temp;
        }
        
    }
}