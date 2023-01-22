import  java.util.Scanner;
public class CheckStringPalindrome {
    public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                String A= sc.nextLine();
              /*  StringBuilder sb= new StringBuilder(A);
                sb.reverse();
                // sb.toString is print the updated string after reversing and then we just compare the string with original one ...
                String res= sb.toString();
                if(A.equals(res)){
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                } */

                StringBuilder b= new StringBuilder(A);
                    b.reverse();
                    String rev= b.toString();
                    if(A.equals(rev)){
                        System.out.println("palindrome ");
                    }
                    else{
                        System.out.println("Not Palindrome");
                    }



            }
        }



