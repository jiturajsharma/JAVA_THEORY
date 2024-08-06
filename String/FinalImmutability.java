public class FinalImmutability {
    public static void main(String[] args) {
        
        int a = 54;
        a = 43;
        // if we print the statement value will be changed automtically
        System.out.println(a);

        // but if i use the "final" keyword then we can not change the value;
        final int c = 4;
        // here is the error when i use final keyword
        // c = 54;
        System.out.println(c);

        final StringBuffer sb = new StringBuffer("Anushka");
        sb.append("Kohli");
        System.out.println(sb);
        //  sb  = new StringBuffer("Sachin"); 
        System.out.println(sb);

    }
}
