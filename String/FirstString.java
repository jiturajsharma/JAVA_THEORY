// String is a refers as the collection of character which are inclose within double court's examples of String "JITU", "*#@&", "1234567"
                // If we inclose in single clouse's then we all considers character's

                
    public class FirstString {
                public static void main(String[] args) {
                String nums = "JituKumar";
                // String is a object method which is writen capital letter in java
                System.out.println(nums);

                // All data types written in small letters eg :- int, short, float double char boolen -> Primitive data types

                // String :- is a written in first letter capital which is called String is a class and class is a bluprint is a object. So we called. String is a obj
                                // Lang package in the presents' sting so that reason no mendatory t use the unport system.

                //  -> In Object like string all types of object allocated memory in heap file 
                // * Java.long   * String package will be created

                // * In object like string all types of object alocated memory in heap file 


/*
 *                                                                              STRING
 *              i.>   Immutable (Non-changable)                                        ii.>   Mutable String (changbale)
 *                    *String                                                                                   *StringBuilder * StringBuffer
                        
 */


                        String school = "Grand Valley Academy";
                        System.out.println(school);
                        school.concat("Jiturajsharma");
        // Answer will be not updated value because String is a object and object is never changed
                        System.out.println(school);

                        StringBuffer ChangeValue = new StringBuffer("GRAND VALLEY");
        // Answer will change because StringBuilder will change the value 
                        System.out.println(ChangeValue);
                        ChangeValue.append(school);
                        System.out.println(ChangeValue);

/*
                                        //      JAVA IS CASE SENSESTIVE
 *      IMMUTABLE STRING :- 
 *                      String varName = "PW";
 *                 String valueName  = new String("Pwskills")
 *              char[] ch = {"PW", 'skills'}
 *                      String varName = new String(ch);
 *      String -> Object -> Heap
 * 
 * 
 * 
 *                      
 */

                        String s1 = "PW";     // it is takes String constant pool
                        String s2 = new String("DATA");   // it is take heap memory
        
        //  -> String constant pool  is don't allow to make duplicate reference

                        String system1 = new String("PW Skills");
                        String system2 = new String("PW Skills");

                        System.out.println(system1==system2);

                        System.out.println(system1.equals(system2));  // equal is compare to value 

                String sys = new String("PW");
                        sys = sys.concat("Skills");
                        System.out.println(sys);    // value we added them and add again value in then reference old value will be leave and table the new reference.

                        String sys1 = "Pw skills";
                        String sys2 = sys1.concat("JITU");
                                System.out.println(sys2);

                                
                }
}