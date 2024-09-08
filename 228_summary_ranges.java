// 228. Summary Ranges
// Category: Intervals
// Difficulty: Easy


class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        ArrayList<String> arr = new ArrayList<>();

        if(nums == null || nums.length == 0)
          return arr;

        int s = 0, e = 0, i = 0;
        int n = nums.length;

        while(i < n)
        {
            if(i + 1 < n && nums[i + 1] - nums[i] == 1)
            {
                e++;
            }
            else {
              
              if(s == e)
              {
                  arr.add(String.valueOf(nums[e]));
              }
              else{
                  arr.add(nums[s] + "->" + nums[e]);
              }

              e++;
              s = e;
            }
          i++;      
        } 
       return arr;
    }
}