class Solution {
    public int maxProduct(int[] nums) {
    //    int curr_prod=1;
    //    int max_prod=Integer.MIN_VALUE;
    //    for(int i=0;i<nums.length;i++){
    //     curr_prod *=nums[i];
        
    //     max_prod=Math.max(curr_prod,max_prod);
    //     if(curr_prod==0){
    //         curr_prod=1;
    //     }
    //    } 
    //    curr_prod=1;
    //    for(int i=nums.length-1;i>=0;i--){
    //     curr_prod *=nums[i];
    //     max_prod=Math.max(curr_prod,max_prod);
    //     if(curr_prod==0){
    //         curr_prod=1;
    //     }
    //    }
    //    return max_prod;

        int maxP = nums[0];
        int minP = nums[0];
        int ans = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = maxP;
                maxP = minP;
                minP = temp;
            }

            maxP = Math.max(nums[i], maxP*nums[i]);
            minP = Math.min(nums[i], minP*nums[i]);
            ans = Math.max(ans, maxP);
        }

        return ans;
    }
}