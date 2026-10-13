class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<blocks.length()-k+1;i++){
            int count=0;
            for(int j=i;j<k+i;j++){    
                if(blocks.charAt(j)=='W'){
                    count++;
                }
            }
            ans = Math.min(ans, count);
        }
        return ans;
    }
}