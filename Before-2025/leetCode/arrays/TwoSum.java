package leetCode.arrays;

import java.util.Arrays;

public class TwoSum{
    public static int[] computes(int[] nums, int target){
        int n = nums.length;
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = { 7,2,5,6,13}; 
        System.out.println(Arrays.toString(computes(nums, 9)));
    }
}
