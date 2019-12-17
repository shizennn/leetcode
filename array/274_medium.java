/*
Input: citations = [3,0,6,1,5]
Output: 3 
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had 
             received 3, 0, 6, 1, 5 citations respectively. 
             Since the researcher has 3 papers with at least 3 citations each and the remaining 
             two with no more than 3 citations each, her h-index is 3.
*/

/*思路：先排序。*/

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i=citations.length; i>0; i--) {
           if(citations[citations.length-i]>=i) return i;
        }
        return 0; 
    }
}
