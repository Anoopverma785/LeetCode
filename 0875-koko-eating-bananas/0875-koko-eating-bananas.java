class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int l=1;
       int max=0;
       int ans=-1;
       for(int p:piles)max=Math.max(max ,p);
        int r=max;
        while(l<=r){
            int k = l+(r-l)/2;
            long hrs = hours(piles, k);
            if(hrs<=h){
            ans =k;
            r=k-1;
            }
            else l=k+1;
        }
        return ans;
    }
    long hours(int piles[] , int k){
        long hrs=0;
        for(int p : piles){
            hrs += p/k;
            if(p%k!=0) hrs++;
        }
        return hrs;
    }
}