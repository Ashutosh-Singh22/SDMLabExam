class FiboSeries{
    public static void main(String args[]){
        
        int first = 1;
        int second = 1;
        System.out.print(first+" "+second+" ");
        for(int i=2; i<20; i++){
            
            int third = first + second;
            System.out.print(third+" ");
            
            first = second;
            second = third;
        }
    }
}