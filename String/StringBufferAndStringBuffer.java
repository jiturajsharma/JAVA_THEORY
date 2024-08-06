/*
 * StringBuffer :- 
                If the content will change frequently then it is not recommended to go for string object becouse for everynew change a new object will be created
                -> To handle this type of requirement, we have a stringBuffer/StringBuilder concept.



    * StringBuffer sb = new StringBuffer();
                        Create an empty stringBuffer object with default initial capacity of "16";
            -> Once stringBuffer reaches its maximum capacity a new stringBuffer object will be created.

            new capacity = (current capcity+ 1) * 2;
 */


public class StringBufferAndStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuilder sec = new StringBuilder();
        sec.append("abcdefghijklmnopqurstuv");
        System.out.println(sec.capacity());   // how many character you can add
        sec.append("f");
        System.out.println(sec.capacity());
        System.out.println(sec.length());    // how many characters are present



        StringBuffer chck = new StringBuffer("Jitu");
        System.out.println(chck.capacity());
        System.out.println(chck.charAt(3));
        
        chck.setCharAt(2, 'U');
            System.out.println(chck);
        

            StringBuilder checkCapacity = new StringBuilder(150);
            System.out.println(checkCapacity.capacity());
            checkCapacity.append("Jva");
            System.out.println(checkCapacity.capacity());
            checkCapacity.trimToSize();
            System.out.println(checkCapacity.capacity());

            StringBuffer fb = new StringBuffer("PW JAVA");
            System.out.println(fb);
            System.out.println(fb.reverse());

    }
}
