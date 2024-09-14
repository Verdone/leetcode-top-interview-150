// 45. Jump Game II
// Category: Array / String
// Difficulty: Medium

class Solution {
    public int jump(int[] nums) {
       int curr = 0; 
       int ct = 0;
       int t = 0;
       for(int i=0; i<nums.length-1; i++){
           t = Math.max(t, i+nums[i]);
           if(i==curr){
              ct++;
              curr = t;
           }
       }
       return ct;
    }
}