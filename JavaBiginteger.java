import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBiginteger{

public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    BigInteger first = new BigInteger(scan.next());
    BigInteger second = new BigInteger(scan.next());

    System.out.println(first.add(second));
    System.out.println(first.multiply(second));

}
}