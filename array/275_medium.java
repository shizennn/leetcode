/*二分查找*/

class Solution {
    public int hIndex(int[] citations) {
        int length=citations.length;
        if((length==0)||(citations[length - 1] == 0)) return 0;
        else {
            int left=0, right=length-1;
            while(left<right) {
                int i = (left+right)/2;
                if(citations[i]<length-i) {
                    left=i+1;
                }
                else {
                    right=i;
                }
            }
            return length-left;
        }
    }
}
