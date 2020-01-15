import java.io.*;
import java.util.*;

public class spiralmatrix {
    static void spiral(int[][] m){
        int i;
        int r2 = m.length-1;
        int c2 = m[0].length-1;
        int r1 = 0;
        int c1 = 0;

        while(r1<=r2 && c1<=c2){
            for(int c=c1; c<= c2; c++){
                System.out.print(m[r1][c] + " ");
            }
            for(int r=r1+1; r<=r2; r++){
                System.out.print(m[r][c2] + " ");
            }
            if(r1 < r2 && c1 < c2){
                for(int c=c2-1; c>c1; c--){
                    System.out.print(m[r2][c] + " ");
                }
                for(int r=r2; r>r1; r--) {
                    System.out.print(m[r][c1] + " ");
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }


    }
    public static void main (String args[]) {
        int m[][] = {
                { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };

        spiral(m);
    }
}
