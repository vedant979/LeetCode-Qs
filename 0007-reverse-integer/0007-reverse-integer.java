class Solution {
    public int reverse(int x) {
        int num =x;

        x = Math.abs(x);
        int reversedNum = 0;
        while(x!=0){
            int rem = x%10;
            if(reversedNum>(Integer.MAX_VALUE-rem)/10){
                return 0;
            }
            System.out.println((Integer.MAX_VALUE-rem));
            reversedNum=reversedNum*10+rem;
            // reversedNum*=10;
            x/=10;
        }
        // long ans = reversedNum/10;
        // System.out.println((int)ans);

        return (num<0)?(-reversedNum):(reversedNum);
    }
}