package Basic.String_InJava;

public class GPT_Strings {
    public static void main(String[] args) {
        System.out.println("Jay");

        String s = new String("I am good");
        String ans =  s.intern();
        System.out.println(ans);
    }
}
