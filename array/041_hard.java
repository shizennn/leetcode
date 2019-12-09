/* 思路：抽屉原理
数组序号0 1 2 3 4本应对应数字1 2 3 4 5.如果"排序后"的序号为i的元素不是i+1, 那i+1就是缺少的正数。*/
/*
Given an unsorted integer array, find the smallest missing positive integer.

Example 1:

Input: [1,2,0]
Output: 3
Example 2:

Input: [3,4,-1,1]
Output: 2
Example 3:

Input: [7,8,9,11,12]
Output: 1
Note:

Your algorithm should run in O(n) time and uses constant extra space.

*/

class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            while (nums[i]!=i+1) {
                 if ((nums[i]>0)&&(nums[i]<=nums.length)&&(nums[i]!=nums[nums[i]-1])) { //注意防止死循环
                    int tmp = nums[i];
                    nums[i] = nums[tmp-1];
                    nums[tmp-1] = tmp;
                }
                else break;
            }
        }

        for (int i=0; i<nums.length; i++) {
            if(nums[i]!=i+1) return (i+1);
        }
        return (nums.length+1);
    }
}
