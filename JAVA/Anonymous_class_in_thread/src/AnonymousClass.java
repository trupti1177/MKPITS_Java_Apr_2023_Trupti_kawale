public class AnonymousClass {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class");
            }
        });
        thread.start();
    }
}