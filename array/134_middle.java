/*如果总的cost大于总的gas，则返回-1；否则一定有解；
如果在第i站时通过计算发现无法达到下一站，则0到i站都不可能是起点。起点移动到i＋１*/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0, cur=0, total=0;
        for(int i=0; i<gas.length; i++) {
            cur = cur+gas[i]-cost[i];
            total = total+gas[i]-cost[i];
            if(cur<0) {
                start=i+1;
                cur=0;
            }
        }
        if(total<0) return -1;
        else return start;
    }
}
