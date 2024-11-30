package KBLVDT.J04016;

import java.util.Scanner;

/**
 *
 * @author Hoàng Hướng
 */
public class Matrix {
    int n,m;
    int[][] arr;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
    }
    
    public void nextMatrix(Scanner sc){
        arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public Matrix mul(Matrix o){
        int n = arr.length;
        int m = o.arr.length;
        int p = o.arr[0].length;
        int[][] a = new int[n][p];
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                int sum=0;
                for(int k=0;k<m;k++){
                    sum += arr[i][k]*o.arr[k][j];
                }
                a[i][j] = sum;
            }
        }
        Matrix res = new Matrix(n,p);
        res.arr = a;
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res += arr[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }
    
    
}
