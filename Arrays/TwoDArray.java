
public class TwoDArray {
    public static void main(String[] args) {
        // 2-D Arrays

        // int nums[] [] = new int[3] [2];   // value will be store in heep
        //     nums[0] [0] = 5;
        //     nums[0] [1] = 15;
        //     nums[1] [0] = 20;
        //     nums[2] [0] = 50;
        //     nums[1] [1] = 55;
        //     nums[2] [1] = 54;

        //WHTA IF
        // int nums [] [] = new int[3][];
        // nums[0] = new int[4];
        // nums[1] = new int[8];
        // nums[2] = new int[90];


        // int nums [] [] = {
        //     {5,3},
        //     {8,3},
        //     {9,4}
        // };

//WHAT IF
//if i have no of colums are fix but row not fixed so that...
int nums[] [] = {
        {5,4,7,8},
        {8,6},
        {7,8,2}
};


        for(int i=0;i<=2;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
