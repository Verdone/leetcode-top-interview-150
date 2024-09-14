// 55. Jump Game
// Category: Array / String
// Difficulty: Medium

class Solution {
    public boolean canJump(int[] nums) {
       if(nums.length==0 || (nums[0]==0 && nums.length!=1)) return false;
       int r=nums[0];
       for(int i=1;i<nums.length-1;i++){
         r=Math.max(r-1,nums[i]);
         if(r==0 ) return false;
       }
       if(r>0 )return true;

       return true;
    }
}