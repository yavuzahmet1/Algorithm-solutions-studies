import error.illegalStateException;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int[] twoSum(int[] nums, int target) throws illegalStateException {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer kalan = target - nums[i];
            if (indexMap.containsKey(kalan)) {
                return new int[]{indexMap.get(kalan), i};
            }
            indexMap.put(nums[i], i);
        }
        throw new illegalStateException("no pair");
    }

    public static void main(String[] args) throws illegalStateException {
        int[] a = {2, 7, 5, 1};
        int target = 12;
        twoSum(a, target);
    }
}