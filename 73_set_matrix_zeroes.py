# 73. Set Matrix Zeroes
# Difficulty: Medium
# Category: Matrix

class Solution:
    def getChanges(self, mat):
        changed = []
        for i in range(len(mat)):
            for j in range(len(mat[0])):
                if mat[i][j] == 0:
                    changed.append((i, j))
        return changed
    def setZeroes(self, matrix) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        changes = self.getChanges(matrix)
        m = len(matrix)
        n = len(matrix[0])
        for coor in changes:
            for i in range(m):
                matrix[i][coor[1]] = 0
            for j in range(n):
                matrix[coor[0]][j] = 0