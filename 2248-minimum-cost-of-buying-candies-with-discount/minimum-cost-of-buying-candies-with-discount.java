class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        
        int minCost = 0;
        for(int i=cost.length-1;i>=0;i-=3){
            if(i-1>=0){
                minCost = minCost+cost[i]+cost[i-1];
            }
            else{
                minCost=minCost+cost[0];
            }
        }

        return minCost;
    }
}