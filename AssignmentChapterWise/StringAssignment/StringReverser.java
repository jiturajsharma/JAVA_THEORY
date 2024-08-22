/*
What is mutable string in java explain with an example?
Ans:->  The string class is immutable, which means that once a string object is created, its value cannot be changed. However, there are other clssses in java, such as StringBuilder and StringBuffer, which are mutable and can be used to manipute strings.
                    Here's an example of using a mutable string in java with the

 */

class StringMethods{
    public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("Hello Duniya");
            sb.append("Welcome");  // append methods adds the string 'World' to the end of sb
            System.out.println(sb);
                    // in this example, we create a StringBuilder object sb with an initial value of "Hello". We then use the append methods to add the string "Wold" to the end of sb. Finally, we print the value of sb, which is "Hello Duniya Welcome"

    }
}

// WAP to reverse a String..?               input :- JITU RAJ SHARMA      output ;- AMRAHS JAR UTIJ

class StringReverser {
    public static void main(String[] args){
        String str = "JITU RAJ SHARMA";
        String result = reverseString(str); 
        System.out.println("The original String is : " + str);
        System.out.println("The reversed string is : " + result);
    }

    // Method to reverse a string
    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}


// 3. WAP to reverse a sentence while preserving the position
class SentenceReverse {
    public static void main (String[] args){
        String  str1 = "Think Twice";
        String str2 = "";
        String sarr[] = str1.split(" ");
        for(String elem: sarr){
            for(int i=elem.length()-1;i>=0;i++){
                str2 = str2+elem.charAt(i);
            }
            str2 = str1 +" ";
        }
        System.out.println(str2);
    }
}

