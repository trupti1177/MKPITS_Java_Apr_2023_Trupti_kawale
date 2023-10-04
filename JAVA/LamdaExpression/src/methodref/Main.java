package methodref;

public class Main {
    public static void main(String[] args) {
       //giving reference of static method to functional interface by using method reference operator

        MyInterface myInterface = StaticMethod::NumberFromOneToTen;

       // giving reference of nonstatic method to functional interface by using method reference operator

        NonStaticMethod nonStaticMethod=new NonStaticMethod();
        MyInterface myInterface1 = nonStaticMethod::NumberFromTenToOne;
        myInterface1.show();

        //giving reference of constructor to the method of class which returns an object of class
        //constructor reference



}
