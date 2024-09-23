// 209. Minimum Size Subarray Sum
// Difficulty: Medium
// Category: Sliding Window

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s = 0 ;
        int a=Integer.MAX_VALUE;
        int j=0;
       for(int i=0 ; i<nums.length ; i++){
           s+=nums[i];
         while(s>=target){
             a=Math.min(a,i-j+1);
             s-=nums[j];
             j++;
         }
       }
       if(a==Integer.MAX_VALUE){
           return 0;
       }
       return a;
    }
}