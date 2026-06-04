class Solution {
    public void reverseString(char[] s) {
        // int sp = 0;
        // int ep = s.length-1;
        // while(sp < ep){
        //     char temp = s[sp];
        //     s[sp] = s[ep];
        //     s[ep] = temp;
        //     sp++;
        //     ep--;
        // }

        reverse(s, 0, s.length-1);
    }

    public static void reverse(char[] s, int left, int right){
        if(left>=right) return;

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverse(s, left+1, right-1);
    }
}