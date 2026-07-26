class Solution {
    public int maximumProduct(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // int maxProduct1 = nums[n-1]*nums[n-2]*nums[n-3];
        // int maxProduct2 = nums[0]*nums[1]*nums[n-1];

        // return Math.max(maxProduct1, maxProduct2);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i]>secondLargest){
                thirdLargest = secondLargest;
                secondLargest = nums[i];
            }
            else if(nums[i]>thirdLargest){
                thirdLargest = nums[i];
            }

            if(nums[i]<smallest){
                secondSmallest = smallest;
                smallest = nums[i];
            }         
            else if(nums[i]<secondSmallest){
                secondSmallest = nums[i];
            }
        }

        int product1 = largest*secondLargest*thirdLargest;
        int product2 = smallest*secondSmallest*largest;
        return Math.max(product1, product2);
    }
}