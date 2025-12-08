import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217_Array

 {

    public static boolean checkDuplicate(int[] nums) {
        for(int i = 0; i< nums.length ; i++) {
            for(int j=i+1 ; j< nums.length ; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    public static boolean checkDuplicateSetMethod(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).map(e -> e).forEach(set::add);
        if(nums.length != set.size())
            return true;
        return false;
    }

    public static boolean checkDuplicateSortingMethod(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i< nums.length - 1 ; i++) {
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(checkDuplicate(nums));
        System.out.println(checkDuplicateSetMethod(nums));
        System.out.println(checkDuplicateSortingMethod(nums));
    }
}