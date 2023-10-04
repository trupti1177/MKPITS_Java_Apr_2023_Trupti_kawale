package stringbuffermethod;

public class InsertMethod {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello ");
        sb.insert(1,"Java");//now original string is changed
        System.out.println(sb);//prints HJavaello
    }
}
//--The insert() method inserts the given String with this string at the given position.--//