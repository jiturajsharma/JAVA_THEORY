// What is a String in Java?
/*
Ans:-> String is a a sequence of characters. But in java, string is an object that represents a  sequence of characters. The java.long.String class is used to create a string object


2. Types of String are?
Ans:-> In java String are classified into 2 types
    i) Mutable String
    ii) Immutable String

3. In how many ways can you create string objects in java?
Ans:- There are two ways to create string objects in java. ONe is using a new operator and another one is using string literals. The objects created using the new operator are stored in the heap memory and objects created using string literals are stored in the string constant pool.

Example :- 
                    String s1 = new String("JITU");    *** Creating string objectr using new operator
                    String s2  = "JITU";  // creating string object using string literal

4. What is a string constant pool?
Ans:- String objects are the most commonly used data objects in java. Hence, java has a special arrangement to store the string objects. String constant Pool is one such arrangement. String constant pool is the heap memory space dedicated to storing string objects created with string literals. In the String constant pool, there will be no two string obejcts with the same constent.
                When you use a string literal to create a string object, JVM first checks the object's content. if there is an object. in the string constant pool with the same content, then it returns the reference to that object. it doesn't create a new object. if the constant differs from the existing objects, nonevent is generated.

5. What do you mean by 'mutable' and 'immutable' objects?
Ans:->
        Immutable objects are like constants. You can't modify them once they are created. They are final in natural. Whereas mutable objects are concerned, you can perform modifications on them.


6. Where exactly is the string constant pool located in the memory?
Ans:->   Inside the heap memroy. JVM reverse some part of the heap memory of store string objects created using string literals. In java, strings are special. String types receive special treatment in java that other types do not. For exampl, to create the string objects, you do not need to use the 'new' keyword. like this strings, enjoy some special attention from java. This attention is worth the while, because the string are used almost everywhere while developing any kind of application.


 */