import java.util.Arrays;
import java.util.Random;

public class Solution {

    int[] nums;
    int[] original;
    Random random;

    public Solution(int[] nums) {
        this.nums = nums;
        original = Arrays.copyOf(nums, nums.length);
        random = new Random();
    }

    public int[] reset() {
        nums = Arrays.copyOf(original, nums.length);
        return nums;

    }

    public int[] shuffle() {
        int upperLimit = nums.length;
        while (upperLimit > 1) {
            int randomIndex = random.nextInt(upperLimit);
            upperLimit--;
            swapNumbers(randomIndex, upperLimit);
        }
        return nums;
    }

    public void swapNumbers(int indexOne, int indexTwo) {
        int temp = nums[indexOne];
        nums[indexOne] = nums[indexTwo];
        nums[indexTwo] = temp;
    }
}
