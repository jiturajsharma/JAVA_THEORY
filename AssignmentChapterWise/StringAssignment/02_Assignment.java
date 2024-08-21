//  1. Write a program to print a String entered by the user?

import java.util.Scanner;


class Answer {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a);
    }
    
}

// 2. How do you concatenate two string in java and given an example?
//      *** You can concatenate two strngs in java using the + operator ;

String str1 = "Hello";
String str2 = "World";
String str3 = str1+str2;


// 3. How do you find the length of a string in java explain with an example?
//    *** The length of a string in java can be found using the length() method

String str = "example";
int lengthofString = str.length();


// 4. How do you compare two strings in java?
// ** Two string in java can be compared using hte equals() methos

public class Main {
    public static void main(String[] args) {
        String st1 = "Hello";
        String st2 = "Hello";

        if(st1.equals(st2)){
            System.out.println("The strings are equal");
        }else{
            System.out.println("The strings are not equal");
        }
    }
}


// 5. Write a program to find the length of the string 'refrigerator'
/**
 * 02_Assignment
 */
class findLength {
    public static void main(String[] args) {
        String a = "refrigerator";
        System.out.println(a.length());
    }
    
}


// 6. Write a program to check if the letter 'e' is presents in the world 'Umbrella'
class WordCheck{
    public static void main(String[] args) {
        String a = "Umbrella";
        boolean per  = false;
            for(int i = 0;i<=a.length();i++){
                if(a.charAt(i) == 'e'){
                    per = true;
                    break;
                }
            }
            System.out.println(per);
    }
}

// 7. Write a program to delete all consonants from the string "Hello", have a good day". (Take input from user)

class delete {
    public static void main(String[] args) {
        String s;
        int j=0;
        System.out.println("Enter a String");
        Scanner so = new Scanner(System.in);
        s = so.nextLine();
        char ch[] = new char[20];
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){

                ch[j++] = s.charAt(i);
            }
            else{
                continue;
            }
        }
        for(int i = 0;i<j;j++){
            System.out.println(ch[i]);
        }
        System.out.println();
    }
}

    



