// Mutable string :- once if we create a string on that string if we try to perform any operation adn if those changes get reflected in the same object then such strings are called 'mutable string'
// Eg;- StringBuffer, StringBuilder

public class MutableString {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("ViratKohli");
            System.out.println(sb);

            // StringBuffer sb = "raj"      -> this is invalid syntex

            sb.append("Anushka");
            System.out.println(sb);


            StringBuilder second = new StringBuilder("ViratKohli");
            System.out.println(second);

            // StringBuffer sb = "raj"      -> this is invalid syntex

            second.append("Anushka");
            System.out.println(second);
    }
    
}
