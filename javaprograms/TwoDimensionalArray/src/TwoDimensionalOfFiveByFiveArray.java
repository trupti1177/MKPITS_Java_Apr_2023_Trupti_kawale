public class
TwoDimensionalOfFiveByFiveArray {
    public static void main(String args[]){
        char [][] array = new char[5][5];

        for( int outerloop=0; outerloop<array.length;outerloop++){
            for(int innerloop=0;innerloop<5;innerloop++){
                if(outerloop==4 || outerloop==0 )
                    array[outerloop][innerloop]='*';
                System.out.print(array[outerloop][innerloop] + " ");
            }
            System.out.println();
        }

    }
}