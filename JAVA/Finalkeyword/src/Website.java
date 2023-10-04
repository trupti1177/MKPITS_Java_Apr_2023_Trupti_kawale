public class Website {
    public boolean check(String str) {
        String s1 = str.substring(0, 11);
        if (s1.equals("http://www.")) {

            if (str.substring(11).contains(".")) {
                System.out.println("Valid website Name");
            } else {
                System.out.println("Invalid website Name");
            }

        }

        return false;
    }

}
