import java.util.*;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Integer candidate1 = Integer.MIN_VALUE, candidate2 = Integer.MIN_VALUE;
        int life1 = 0;
        int life2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (candidate1 == nums[i])
                life1++;
            else if (candidate2 == nums[i])
                life2++;

            else if (life1 == 0) {
                candidate1 = nums[i];
                life1 = 1;
            } else if (life2 == 0) {
                candidate2 = nums[i];
                life2 = 1;
            }

            else {
                life1--;
                life2--;
            }
        }

        // to confirm that is this right or not
        life1 = 0;
        life2 = 0;

        for (int num : nums) {
            if (candidate1 != null && num == candidate1.intValue()) {
                life1++;
            }
            if (candidate2 != null && num == candidate2.intValue()) {
                life2++;
            }
        }

        // Add elements meeting the majority criteria to the result list
        List<Integer> result = new ArrayList<>();
        if (life1 > nums.length / 3)
            result.add(candidate1);
        if (life2 > nums.length / 3)
            result.add(candidate2);
        return result;
    }
}
