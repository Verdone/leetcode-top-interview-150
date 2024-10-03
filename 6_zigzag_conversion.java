// 6. Zigzag Conversion
// Difficulty: Medium
// Category: Array / String

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length())
            return s;

        char[] arr = new char[s.length()];
        
        int d = numRows + (numRows-2);
        int i = 0;
        for(int row=0; row<numRows; row++){
            int curr = row;
            while(curr < s.length()){
                arr[i++] = s.charAt(curr);
                if(row == 0 || row == numRows-1){
                    curr += d;
                }
                else{
                    int newcurr = curr + (d - (row * 2));
                    if(newcurr != curr && newcurr < s.length()){
                        arr[i++] = s.charAt(newcurr);
                    }
                    curr += d;
                }
            }
        }
        return new String(arr);
    }
}
