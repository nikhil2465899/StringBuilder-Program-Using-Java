import java.util.Scanner;

public class StringSpaceCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s= sc.next();
        StringBuilder sb= new StringBuilder(s);
        sb.substring(1);
    }
}
