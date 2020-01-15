
import java.io.*;
import java.util.*;

public class practice {
    public static void main(String[] args) throws IOException {
        //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //String inputString = input.readLine();
        //System.out.println(inputString);
        int[] A = new int[]{1,0,0,1,1,1};

        int resbits = 0;
        //double resceil = 0;
        ArrayList<Integer> values = new ArrayList<>();

        for(int i=0; i<A.length; i++){
            resbits = resbits + A[i]* (int)Math.pow(-2,i);
        }

        int ceiling = (int)resbits;

        ceiling = (-1) * ceiling;
        System.out.println(ceiling);

        //int remaining = 0;
        while(ceiling != 0) {
            int remaining = ceiling % -2;
            ceiling = (int) Math.ceil((double)ceiling/-2);
            System.out.println(Math.abs(remaining));
            values.add(Math.abs(remaining));
        }


        int n = values.size();
        int arr[] = new int[n];
        for(int i=0; i<values.size(); i++){
            arr[i] = values.get(i);
        }

    }
}
