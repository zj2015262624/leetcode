package leetcodeAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/11/5 0005.
 */
public class ThreeSum {
    public class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> results = new ArrayList<List<Integer>>();
            if(nums.length < 3){
                return results;
            }
            for(int i = 0;i<nums.length -2;i++){
                int left = i+1;
                int right = nums.length-1;
                while(left < right){
                    int sum = nums[i] +  nums[left] + nums[right];
                    if(sum == 0){
                        results.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[left],nums[right])));
                        while(left + 1 < right && nums[left] == nums[left + 1]) left++;
                        left++;
                    }else if(sum < 0){
                        left++;
                    }else{
                        right--;
                    }
                }
                while(i + 1 < nums.length - 2 && nums[i] == nums[i + 1]) i++;
            }
            return results;
        }

    }
}
