/*
Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.

It doesn't matter what you leave beyond the returned length.

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/
/*设置两个指针pre和cur。
如果第一次pre和cur相同就两者都移动，如果第大于一次两者相同就保持pre不动，只移动cur。
直到pre和cur的值不同。这时把cur的值覆盖在pre+1上。
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int pre=0, cur=1;
        int cnt=1;
        while (cur<nums.length) {
            if((nums[pre]==nums[cur])&&(cnt==0)) {
                cur++;
            }
            else if ((nums[pre]==nums[cur])&&(cnt!=0)) {
                nums[pre+1] = nums[cur];
                cnt--;
                pre++;
                cur++;
            }
            else if (nums[pre]!=nums[cur]) {
                nums[pre+1] = nums[cur];
                pre++;
                cur++;
                cnt = 1;
            }
        }
        return ++pre;
    }
}

作者：lulu-69
链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/solution/javajie-da-she-zhi-liang-ge-zhi-zhen-by-lulu-69/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
