class Armstrong{
    public static void main(String args[]){
        int num = 123;

        int temp = num;
        int rem;
        int sum = 0;
        while(temp>0){
            rem = temp%10;
            sum = sum + rem*rem*rem;
            temp = temp/10;
        }

        switch(1){
            case 1: if(sum==num) System.out.println(num+" is an armstrong number");
                    else         System.out.println(num+" is NOT an armstrong number");
        }
    }
}