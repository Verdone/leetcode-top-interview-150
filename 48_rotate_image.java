// 48. Rotate Image
// Difficulty: Medium
// Category: Matrix

class Solution {
    public void rotate(int[][] matrix) {
        List<List<Integer>> li = new ArrayList<List<Integer>>();
        for (int i = 0; i < matrix.length; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = matrix.length - 1; j >= 0; j--) {
                l.add(matrix[j][i]);
            }
            li.add(l);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = li.get(i).get(j);
            }
        }
    }
}