import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        int k=0;

            for(int i=0,j=A.length()-1;i<=j;i++,j--) {

            if(A.charAt(i)!=A.charAt(j)) 
            {k=1;}

            }

    System.out.println((k==0)?"Yes":"No");
                
    }
}



