public class MyClass {
  public static void main(String[] args) {
    final int num = 10;
    System.out.println(num); // prints 10

    // the following line will cause an error because num is final
    num = 20;
  }
}