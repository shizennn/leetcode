/*
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
*/

/*最土的办法，设置两个for循环逐一比较。不过要注意临界情况（i+k和num.length的大小）*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int length=nums.length;
        if((nums.length==0)||(nums.length==0)) {
            return false;
        }

        for (int i=0; i<length-1; i++) {
            if(i+k>length-1) {
                for (int j=i+1; j<=length-1;j++) {
                    if(nums[i]==nums[j]) return true;
                }
            }
            else {
            for (int j=i+1; j<=i+k;j++) {
                if(nums[i]==nums[j]) return true;
            }
            }
        }

        return false;
    }
}

作者：lulu-69
链接：https://leetcode-cn.com/problems/contains-duplicate-ii/solution/nei-cun-xiao-hao-ji-bai-liao-9911-by-lulu-69/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
