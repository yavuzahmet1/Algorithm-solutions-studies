import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int[] twoSum(int[] nums, int target) throws IllegalAccessException {
       /* for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
       throw new IllegalAccessException(("no pair found"));*/
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer kalan = target - nums[i];
            if (indexMap.containsKey(kalan)) {
                return new int[]{indexMap.get(kalan), i};
            }
            indexMap.put(nums[i], i);

        }
        return null;
    }

    public static void main(String[] args) throws IllegalAccessException {
        int[] nums = {3, 2, 4};
        System.out.println(twoSum(nums, 6));
    }
}