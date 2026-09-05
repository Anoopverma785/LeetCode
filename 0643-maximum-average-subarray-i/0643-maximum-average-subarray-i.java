class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int sum=0;
       for(int i=0; i<k; i++){
        sum=sum+nums[i];
       } 
       int maxsum =sum;
       int s=0;
       int l=k;
       while(l<nums.length){
        sum= sum-nums[s];
        s++;
        sum =sum+nums[l];
        l++;
        maxsum=Math.max(maxsum ,sum);
       }
       return (double) maxsum/k;
    }
}