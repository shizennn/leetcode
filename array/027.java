/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example 1:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

It doesn't matter what you leave beyond the returned length.

*/

/*这道题让我们移除一个数组中和给定值相同的数字，并返回新的数组的长度。是一道比较容易的题，只需要一个变量用来计数，然后遍历原数组，
如果当前的值和给定值不同，就把当前值覆盖计数变量的位置，并将计数变量加1。*/

public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
}


