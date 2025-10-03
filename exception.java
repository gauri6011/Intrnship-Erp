class exception{
    public static void main(String[] args){
        int num1=40;
        int num2=0;

        try {
            int ans =num1/num2;
            System.err.println("Answer is :"+ans);
            
        } catch (Exception e) {
            System.out.println(" Divide by zero is not allowed");
        }
    }
}