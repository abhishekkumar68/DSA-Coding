class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        // int maxProduct1=1;
        // int count=3;
        // int i = nums.length-1;
        // while(count>0){
        //     maxProduct1*=nums[i];
        //     count--;
        //     i--;
        // }
        int n = nums.length;
        int maxProduct1 = nums[n-1]*nums[n-2]*nums[n-3];
        int maxProduct2 = nums[0]*nums[1]*nums[n-1];

        return Math.max(maxProduct1, maxProduct2);
        
    }
}