class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    static boolean isHappy(int n) {
        int num;
        while(isPowOf10(n)==false){
            num=0;
            while(n>0){
                num += (n%10) * (n*10);
                n/=10;
            }
            n=num;
        }
        return true;
    }
    static boolean isPowOf10(int input){
        while (input >= 10 && input % 10 == 0)
            input /= 10;
        return input == 1;
    }
}

