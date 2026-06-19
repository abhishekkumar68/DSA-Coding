class Solution {
    public int largestAltitude(int[] gain) {
        int max = gain[0];
        for(int i=1;i<gain.length;i++){
            int temp = gain[i-1]+gain[i];

            gain[i]=temp;

            if(max<temp){
                max=temp;
            }
        }
        if(max<0) return 0;
        else return max;
    }
}