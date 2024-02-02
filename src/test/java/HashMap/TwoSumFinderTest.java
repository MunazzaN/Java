package HashMap;

public class TwoSumFinderTest {

    public static void main(String[] args) {
        // Test case 1
        System.out.println("Test Case 1:");
        int[] nums1 = {10, 20, 30, 40, 50, 60};
        int target1 = 100;
        printResult(TwoSumFinder.findTwoSumIndices(nums1, target1));

        // Test case 2
        System.out.println("\nTest Case 2:");
        int[] nums2 = {2, 7, 11, 15};
        int target2 = 9;
        printResult(TwoSumFinder.findTwoSumIndices(nums2, target2));

        // Add more test cases as needed
    }

    private static void printResult(int[] result) {
        if (result.length == 2) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No such pair found.");
        }
    }
}

