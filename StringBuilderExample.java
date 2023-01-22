import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string here: ");
        String s= sc.nextLine();
        StringBuilder sb= new StringBuilder(s);
        // here print the normal string.
        System.out.println(sb);
        // add the other string in this string.
        sb.append("gurav");
        System.out.println(sb);
        // see  particular character  in string..
        System.out.println( sb.charAt(0));
        // add in particular index in string .
        sb.insert(0,"MR.");
        System.out.println(sb);
        // substring in our main string
        System.out.println(sb.substring(2));
        System.out.println(sb.substring(3,5));
        // delete the particular element in string
        System.out.println(sb.deleteCharAt(2));
        // reverse the string
        System.out.println(sb.reverse());
        String res= sb.toString();
        System.out.println(res);



    }
}
