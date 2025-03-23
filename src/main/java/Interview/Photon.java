package Interview;

/***
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * Example 1:
 * Input: nums = [1,2,3,4] Output: [24,12,8,6]
 */

/***
 * you are given a string s, which contains stars *.
 * In one operation, you can:
 * · Choose a star in s.
 * · Remove the closest non-star character to its left, as well as remove the star itself.
 * Return the string after all stars have been removed.
 * Note:
 * · The input will be generated such that the operation is always possible.
 * · It can be shown that the resulting string will always be unique.
 * Example 1:
 * Input: s = "leet**cod*e" Output: "lecoe"
 */

public class Photon {

    /***
     * [i]=0 =2*3*4
     * [i]=1=3*4
     * [i]=2 =*4
     */

    public static void main(String[] args) {
        test();
    }

    public static void test(){

        int [] nums = {1,2,3,4};
        int []output=new int[nums.length];
        int productOf=1;
        int num=0;
        for (int i = 0; i <nums.length ; i++) {
            if(i == num && i < nums.length && num<nums.length ){
                productOf = productOf*nums[num+1];
                output[i]= productOf;
                System.out.println(output[i]);
                num++;
            }


        }



    }
}
