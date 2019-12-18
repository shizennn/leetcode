/*
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
*/

/*解法1：排序，如果第i个元素和第i+1个元素相同，则返回true*/
/*解法2：哈希表。如果在map中contain某个元素，则返回true，否则add该元素*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        if((nums.length==0)||(nums.length==1)) return false;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]==nums[i+1]) return true; 
        }
        return false; 
    }
}
