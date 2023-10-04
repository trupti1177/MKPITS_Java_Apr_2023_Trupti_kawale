public class AnonymousClassMain {
    static int number = 0;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Pink");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("yellow");
            }
        });
    }
}