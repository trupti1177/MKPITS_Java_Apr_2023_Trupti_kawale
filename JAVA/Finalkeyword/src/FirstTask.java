import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FirstTask {

    public static void writeObjectToFile(Student s) throws IOException {


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teja.txt"));
        oos.writeObject(s);
        oos.close();
    }

    public static void readObjectFromFile(){

    }

}

