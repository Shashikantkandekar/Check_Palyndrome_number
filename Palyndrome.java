class Palyndrome{
    public static void main(String[] args) {
        int number=12;
        int revers=0;

        while (number !=0){
            revers = revers*10+number%10;
            number=number/10;
        }
        int orignal_number =number;
        if( orignal_number==revers ){
            System.out.println("Number is Palyndrome.....");
        }
        else{
            System.out.println("Number is not Palyndrome.....");
        }
    }
}