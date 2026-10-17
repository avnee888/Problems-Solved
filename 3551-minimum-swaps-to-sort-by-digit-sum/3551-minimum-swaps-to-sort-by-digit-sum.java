
import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;

        // Store each number with its digit sum
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        // Sort by digit sum, then by number
        Arrays.sort(arr, (a, b) -> {
            int sumA = sumdigit(a);
            int sumB = sumdigit(b);

            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }
            return Integer.compare(a, b);
        });

        // Map each number to its index in the original array
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        // Count minimum swaps using cycle detection
        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || nums[i] == arr[i]) {
                visited[i] = true;
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;

                // Find where the current number belongs
                j = map.get(arr[j]);
                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += cycleSize - 1;
            }
        }

        return swaps;
    }

    public int sumdigit(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
