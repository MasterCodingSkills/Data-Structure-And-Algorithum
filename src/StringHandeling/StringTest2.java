package StringHandeling;

public class StringTest2 {
    public static void main(String[] args) {
        StringTest2 st = new StringTest2();
        st.m1(new Object());
        st.m1("abc");
        //st.m1(null);
    }
    public void m1(StringBuffer sb){
        System.out.println("String Buffer Version");
    }

    public void m1(String s){
        System.out.println("String version");
    }

    public void m1(Object o){
        System.out.println("Object version");
    }
}
