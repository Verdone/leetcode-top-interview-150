// 54. Spiral Matrix
// Difficulty: Medium
// Category: Matrix

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        List<Integer> list= new ArrayList<>();

        if(row==0 || col==0){return list;}

        int  l=0,r=col-1,t=0,b=row-1;

        while(t<=b && l<=r)
        {
            for(int i=l;i<=r;i++){list.add(matrix[t][i]);} 
            t++;

            for(int i=t;i<=b;i++){list.add(matrix[i][r]);}
            r--;

            if(t<=b)
            {for(int i=r;i>=l;i--){list.add(matrix[b][i]);}
            b--;}

            if(l<=r)
            {for(int i=b;i>=t;i--){list.add(matrix[i][l]);}
            l++;}
        }
        return list;
    }
}