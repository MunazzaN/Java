package HashMap;

import java.util.HashMap;

public class TwoSumFinder {

    public static int[] findTwoSumIndices(int[] nums, int target) {
        HashMap<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is already in the HashMap
            if (numIndices.containsKey(complement)) {
                return new int[]{numIndices.get(complement), i};
            }

            // Add the current number and its index to the HashMap
            numIndices.put(nums[i], i);
        }

        // Return an empty array if no such pair is found
        return new int[0];
    }
}