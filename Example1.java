import java.util.Locale;

public class Example1 {
    public static void main(String[] args) {
        String s1= "nikhil";

        System.out.println(s1);

    }
}
// So in the string s1 is stored in the #stack_memory and data contain s1 stored in the #heap_memory.
// when you add the element in the s1 string then it would be like-:
/*  string s1= "nikhil";
     s1+"g";
     s1+"u";
     s1+"r";
     s1+"a";
     s1+"v";

     so,in the stack memory contain s1 points-> "nikhil g" first then nikhil gets delete and after add second element
     u then pointer points to "nikhil gu" then again "nikhil g" get delete.
     So its leanthy process that why string updated in string builder method......


 */
