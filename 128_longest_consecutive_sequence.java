// 128. Longest Consecutive Sequence
// Difficulty: Medium
// Category: Hashmap

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1){
            return 1;
        }

        Set<Integer> h= new HashSet<>();

        for(int i =0; i<nums.length; i++){
            h.add(nums[i]);
        }
        
        int length= 0;
         int curr =0;
         int low=0;
         int up=0;

        for(int j =0; j<nums.length; j++){
            int k =nums[j];

            if(h.remove(k)){
                 low=k-1;
                 up=k+1;
                curr+=1;
            }

            while(h.remove(low)){
                low-=1;
                curr+=1;
            }
            while(h.remove(up)){
                curr+=1;
                up+=1;
            }

            length = Math.max(length, curr);
            curr=0;
        }
        return length;
    }
}