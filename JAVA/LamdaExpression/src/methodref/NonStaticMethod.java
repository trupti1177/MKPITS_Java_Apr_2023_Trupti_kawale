package methodref;

public class NonStaticMethod {
    MyClass myClass=new MyClass();
    MyInterface myInterface=myClass::display;
    MyInterface.disp();
    Runnable runnable=MyClass::display;
    Thread thread=new Thread(runnable);
    thread.start();
}
