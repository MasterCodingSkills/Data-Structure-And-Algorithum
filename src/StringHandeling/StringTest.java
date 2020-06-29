package StringHandeling;


public class StringTest {

    public static void main(String[] args) {
        String s1 = new String("Manish");
        String s2 = new String("Manish");
        String s3 = "Manish";
        String s4 = "Manish";

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);

        StringBuffer sb = new StringBuffer("HelloWorld");
        sb.append("asdfadfasdfasdfasdfasdfasdfasdf");
        sb.append("12345678912345");

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        String str = new String(sb.reverse());
        System.out.println(str);
    }
}
