import java.io.*;
import java.util.*;


public class stringpractice {

    public static void main(String[] args) throws IOException {
        int A = 1;
        int B = 6;
        int C = 8;

        String str = "";
        //A, B > 0 or A, C > 0 or B, C > 0
        //A > 0 && (B > 0 || C > 0) || (B>0 && C>0)
        while ( A > 0 || B > 0 || C > 0){
            if (A > B && A > C){
                if ( C == 0 && B == 0 && A>1 ){
                    str = str + ("aa");
                    A = 0;
                }
                if(A > 0){
                    str = str + ("a");
                    A--;
                }
                if(A > 0){
                    str = str + ("a");
                    A--;
                }
                if(B > 0){
                    str = str + ("b");
                    B--;
                }
                if(A > 0 && B > 0){
                    str = str + ("a");
                    A--;
                }
                if(A > 0 && B > 0){
                    str = str + ("a");
                    A--;
                }
                if(C > 0) {
                    str = str + ("c");
                    C--;
                }
                if(A > 0 && C > 0){
                    str = str + ("a");
                    A--;
                }
                if(A > 0 && C > 0){
                    str = str + ("a");
                    A--;
                }
            }
            else if(B > A && B > C){
                if ( A == 0 && C == 0 && B>1 ){
                    str = str + ("bb");
                    B = 0;
                }
                if(B > 0){
                    str = str + ("b");
                    B--;
                }
                if(B > 0){
                    str = str + ("b");
                    B--;
                }
                if(A > 0){
                    str = str + ("a");
                    A--;
                }
                if(B > 0 && A > 0){
                    str = str + ("b");
                    B--;
                }
                if(B > 0 && A > 0){
                    str = str + ("b");
                    B--;
                }
                if(C > 0){
                    str = str + ("c");
                    C--;
                }
                if(B > 0 && C > 0){
                    str = str + ("b");
                    B--;
                }
                if(B > 0 && C > 0){
                    str = str + ("b");
                    B--;
                }
            }
            else if(C > A && C > B){
                if ( A == 0 && B == 0 && C>1 ){
                    str = str + ("cc");
                    C = 0;
                }
                if(C > 0){
                    str = str + ("c");
                    C--;
                }
                if(C > 0){
                    str = str + ("c");
                    C--;
                }
                if(A > 0){
                    str = str + ("a");
                    A--;
                }
                if(C > 0 && A > 0){
                    str = str + ("c");
                    C--;
                }
                if(C > 0 && A > 0){
                    str = str + ("c");
                    C--;
                }
                if(B > 0){
                    str = str + ("b");
                    B--;
                }
                if(C > 0 && B > 0){
                    str = str + ("c");
                    C--;
                }
                if(C > 0 && B > 0){
                    str = str + ("c");
                    C--;
                }
            }
            else if(A == B){
                str = str + ("ab");
                A--;
                B--;
            }
            else if(A == C){
                str = str + ("ac");
                A--;
                C--;
            }
            else if(B == C){
                str = str + ("bc");
                B--;
                C--;
            }
        }
        System.out.println(str);
    }
}
