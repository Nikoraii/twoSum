package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] nums = new int[]{-1, -2, -3, -4, -5};
        int target = -8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if ((nums[i] + nums[i + j]) == target) {
                    result[0] = i;
                    result[1] = (i + j);
                }
            }
        }
        return result;
    }
}