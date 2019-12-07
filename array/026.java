/*
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
*/

/*设置一个指针i和一个计数器cnt。比较num[i]和num[i+1]的值，如果不同，则cnt++, 而且将num[cnt]的值设置为新发现的值*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 1;
        for (int i=0; i<nums.length-1; i++) {
            if(nums[i]!=nums[i+1]) {
                nums[cnt] = nums[i+1];
                cnt++;
            }
        }
        return cnt;
    }
}

作者：lulu-69
链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/solution/javati-jie-by-lulu-69/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
