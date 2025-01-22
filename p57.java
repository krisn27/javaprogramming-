
import java.util.Arrays;

public class p57 {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(nums);

        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
        System.out.println("Number of unique elements: " + newLength);
    }
}
