class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        // int[] ans = new int[A.length];

        // for(int i=0;i<A.length;i++){
        //     int count = 0;
        //     for(int j=0;j<=i;j++){
        //         for(int k=0;k<=i;k++){
        //             if(A[j]==B[k]){
        //                 count++;
        //                 break;
        //             }
        //         }
        //     }
        //     ans[i] = count;
        // }
        // return ans;

        int[] ans = new int[A.length];
        HashSet<Integer> setA =  new HashSet<>();
        HashSet<Integer> setB =  new HashSet<>();
        int common = 0;

        for(int i=0;i<A.length;i++){
            if(A[i]==B[i]){
                common++;
            }
            else{
                if(setB.contains(A[i])){
                    common++;
                }
                if(setA.contains(B[i])){
                    common++;
                }
            }

            setA.add(A[i]);
            setB.add(B[i]);
            ans[i]=common;
        }

        return ans;

    }
}