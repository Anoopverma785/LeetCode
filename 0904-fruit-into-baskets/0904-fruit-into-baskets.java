class Solution {
    public int totalFruit(int[] fruits) {
        int max=0;
        int n= fruits.length;
            int s=0;
            int e=0;
            int fr[]=new int[n];
            int types=0;
          while(e<n){
            int ft =fruits[e];
            if(fr[ft]==0)types++;
            fr[ft]++;
            while(types > 2){
                int sft = fruits[s];
                fr[sft]--;
                if(fr[sft]==0)types--;
                s++;
            }
            int size= e-s+1; 
      max = Math.max(max , size);
      e++;
              }
                  
        return max;
    }
}