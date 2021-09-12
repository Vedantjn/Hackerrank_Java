import java.util.Scanner;

// Scanner sc=new Scanner(System.in);
// String A=sc.next();
// String B=sc.next();
// // System.out.println(A.length()+B.length());
// // System.out.println(A.compareTo(B)>0?"Yes":"No");
// // System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()))

    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.print(A.length()+B.length()+"\n"+(A.compareTo(B)>0 ? "Yes" : "No")+"\n"+uC(A)+" "+uC(B));}
    private static String uC(String str){
        char[] ch = str.toCharArray();
        if(ch[0] >= 'a' && ch[0] <= 'z')ch[0]-=32;
        return String.valueOf(ch);
    }
}