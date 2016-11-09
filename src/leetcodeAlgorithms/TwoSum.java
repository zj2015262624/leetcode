package leetcodeAlgorithms;


/**
 * twoSum on leetcode
 * Created by zhangjian on 2016/11/5 0005.
 */
public class TwoSum {
    /**
     *Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
     Note: The solution set must not contain duplicate triplets.
     For example, given array S = [-1, 0, 1, 2, -1, -4],
     A solution set is:
     [
     [-1, 0, 1],
     [-1, -1, 2]
     ]
     *
     * @param nums
     * @param target
     * @return indices
     */
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }

            }

        }
        return indices;
    }
}
