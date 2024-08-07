package CollectionAndMapAPI;

import java.util.ArrayList;

public class CollectionPackageArrylist {
        public static void main(String[] args) {
// collection of arrylist is homoginious as well as hetrogenious as it is daynamically in nature

            ArrayList all1 = new ArrayList();
            all1.add("SHARMA");
            all1.add(499);
            all1.add(32);
            System.out.println(all1);
            System.out.println("*********************************************************");
            
            // in collection package we will store multiple type of value will be store like
            ArrayList all2 = new ArrayList();
            all2.add(43);
            all2.add("StringValue");
            all2.add('j');
            all2.add(1.1);
            System.out.println(all2);
            
            System.out.println(all2.isEmpty());
            System.out.println(all2.remove(0));
            System.out.println(all2);
            System.out.println("*********************************************************");
            

            ArrayList all3 = new ArrayList();
            //order of insesation preserved is retained;
            all3.add(7);
            all3.add(4);
            all3.add(5);
            
            System.out.println(all3);
            // all3.add(all1);
            // if we doing as  it then value will be added but array in array value added
            // System.out.println(all3);

            all3.addAll(all2);
            System.out.println(all3);
        
            all3.add(2, "pw");
            System.out.println(all3);
            all3.removeAll(all2);
            System.out.println(all3);
            //in collection douplicate value will be allowed
            all3.add(5);
            System.out.println(all3);


        }
        
}