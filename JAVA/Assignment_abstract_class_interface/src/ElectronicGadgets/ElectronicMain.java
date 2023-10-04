package ElectronicGadgets;

public class ElectronicMain implements Electronic,Fridge,WashingMachine {
    @Override
    public void electronicType1(){
        System.out.println("Electronics Items");
    }
    public void electronicType2(){
        System.out.println("i'm Fridge");
    }
    public void electronicType3(){
        System.out.println("i'm washingMachine");
    }

    public static void main(String[] args) {
        ElectronicMain electronicMain = new ElectronicMain();
        electronicMain.electronicType1();
        electronicMain.electronicType2();
        electronicMain.electronicType3();
    }
}