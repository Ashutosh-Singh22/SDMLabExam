class PrimeNumbers{
    public static void main(String args[]){

        for(int i=2; i<=20; i++){
            printPrime(i);
        }
    }

    public static void printPrime(int i){
        int flag = -1;
        for(int j = i-1; j>=2; j--){
            if(i%j==0){
                flag = 1;
            }
        }

        switch(flag){
            case -1 : System.out.print(i+" ");
        }
    }
}