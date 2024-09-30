// 134. Gas Station
// Difficulty: Medium
// Topic: Array / String

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int a=0;
        int t=0;
        int s=0;
        for(int i=0; i<gas.length; i++){
            int net = gas[i]-cost[i];
            t+=net;
            a+=net;
            if(t<0){
                t=0;
                s=i+1;
            }
        }
        if(a<0){
            return -1;
        }
        return s;
    }
}