import java.io.*;
import java.util.*;

public class revstring {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            left++;
            s[right] = tmp;
            right--;
        }
    }
    public static void main (String args[])
    {
        revstring object = new revstring();

        char[] a = {'H','E','L','L','O'};

        object.reverseString(a);

        System.out.println(a);
    }
}
