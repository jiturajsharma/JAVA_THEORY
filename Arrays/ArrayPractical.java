// it refers to index collection of fixed number of homogeneous data elements.
// single variable hholding mutiple values which imroves readability of the programs.

public class ArrayPractical {
    //ONE DIMENSTIONAL ARRAY
        public static void main(String[] args) {
            // Declaration of array
            // int[] a;     // recomended to use as variable is separated from type.
            // int b[];
            // int []c;
            //int[6] a;  // compile time error we cannot specify the size



            //int nums[]; // in this array memory is not allocated
            //nums[0] = 54;     // it is not working because in array no value insert and modified



//if we know the array of bracket than use this syntex 
            // int nums[] ={4,5,6,7};      // if defined the array of value then we can access and modified wtith the help of indexes
            //nums[0] =43;     it's working

            // System.out.println(nums[0]);         print of arrays wwith the help of index value
            // System.out.println(nums[1]);
            // System.out.println(nums[2]);
            // System.out.println(nums[3]);

            // for(int i=0;i<=3;i++){
            //     System.out.println(nums[i]);
            //     //System.out.print("Print of all index"  +   i);
            // }

            

            // if we will make allocated memory in heff
// if we don't know what value of array then use this syntex otherwise next
            // int nums[] = new int[5];    // initial stage default value is zero because int value default
            // nums[0] = 55;
            // nums[1] = 586785;
            // nums[2] = 6546;
            // nums [3] = 645;
            // nums [4] = 6545456;

            // for(int i=0;i<=4;i++){
            //     System.out.println(nums[i]);
            // }

            
            String name[] = {"jitu", "Harsh", "Mahesh"};
            name[2] = "Kundan";

            for(int i=0;i<=2;i++){
                System.out.println(name[i]);
            }


        }
}