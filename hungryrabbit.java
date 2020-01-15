import java.io.*;
import java.util.*;

public class hungryrabbit {
    public static int count_carrots(int[][] m, int row, int col){
        int[][] movement = {{-1,0}, {1,0}, {0,-1}, {0,1}}; //possible movements of the rabbit
        int max = 0;
        int r_next = -1;
        int c_next = -1;

        for (int i=0; i<movement.length; i++){
            int move_row = movement[i][0];
            int move_col = movement[i][1];
            if(row + move_row >= 0 && row + move_row < m.length && col + move_col >=0 && col + move_col < m[row].length){
                if(m[row + move_row][col + move_col] > max){
                    max = m[row + move_row][col + move_col];
                    r_next = row + move_row;
                    c_next = col + move_col;
                }
            }
        }
        int max_carrots = m[row][col];
        m[row][col] = 0;

        //recurse until no carrots left on any of the adjacent squares
        if(max >0 && r_next != -1 && c_next != -1){
            max_carrots += count_carrots(m, r_next, c_next);
        }
        return max_carrots;

    }
    public static int[] find_center(int[][] m){
        int[] empty = {};
        if(m.length ==0 || m[0].length == 0){
            return empty;
        }
        //if odd, floor(size/2)
        int[] possible_rows = {(int) Math.floor((double)m.length/2), (int) Math.floor((double)m.length/2)};
        int[] possible_cols = {(int) Math.floor((double)m[0].length/2), (int) Math.floor((double)m[0].length/2)};

        //if even, index - 1
        if (m.length%2 == 0){
            possible_rows[0] -= 1;
        }
        if(m[0].length%2 == 0){
            possible_cols[0] -= 1;
        }
        int max = 0;
        int row = 0;
        int col= 0;

        //find possible center with highest number of carrots
        for (int i=0; i<possible_rows.length; i++){
            for(int j=0; j<possible_cols.length; j++){
                if(m[possible_rows[i]][possible_cols[j]] > max){
                    max = m[possible_rows[i]][possible_cols[j]];
                    row = possible_rows[i];
                    col = possible_cols[j];
                }
            }
        }
        int[] result = {row, col};
        return result;
    }

    public static void main (String args[]) {
        int[][] m = {{5,7,8,6,3},
                {0,0,7,0,4},
                {4,6,3,4,9},
                {3,1,0,5,8}};
        int[][] none = {{}};

        int[] center = find_center(m);

        if(center.length != 0) {
            int row = center[0]; //possible row for center
            int col = center[1]; //possible col for center
            System.out.println(count_carrots(m, row, col));
        }
        else{
            System.out.println("center not found");
        }

    }

}
