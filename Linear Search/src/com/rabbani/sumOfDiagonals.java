package com.rabbani;

public class sumOfDiagonals {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int ans=diagonalSum(mat);
        System.out.println(ans);
    }

    static int diagonalSum(int[][] mat) {
        int primary = 0;
        int secondary = 0;
        int midelement = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {

                if (row == col) {
                    primary += mat[row][col];

                }

                if (row == mat.length - 1 - col) {
                    secondary += mat[row][col];
                }

                if (mat.length%2==1) {
                    midelement = mat[mat.length/2][mat.length/2];
                }

            }

        }

        int sum = primary + secondary - midelement;
        return sum;
    }
}

/** int n = mat.length;

 int sum = 0;
 for(int i = 0; i<n;i++)
 //first sum for primary diagonal and 2nd one is for secondry diagonal
 sum += mat[i][i] + mat[i][n-i-1];

 //if n is odd then subtract the center index once from the sum
 if(n%2==1)
 sum -= mat[n/2][n/2];

 return sum;*/







