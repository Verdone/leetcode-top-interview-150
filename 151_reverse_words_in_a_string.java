// 151. Reverse Words in a String
// Difficulty: Medium
// Category: Array / String

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder res=new StringBuilder();
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i+1)!=' '){
                res.insert(0,sb);
                sb.setLength(0);
                res.insert(0," ");
            }
            if(i==s.length()-1){
               res.insert(0,sb); 
            }
        }
       return res.toString();
    }
}