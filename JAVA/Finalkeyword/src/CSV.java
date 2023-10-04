import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CSV {

            public static void main(String[] args) {
                String line = "";
                String splitBy = ",";
                try {

                    BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Dell\\Desktop\\sample.csv"));
                    while ((line = bufferedReader.readLine()) != null)

                    {
                        String[] employee = line.split(splitBy);

                        System.out.println("Emp[First Name=" + employee[1] + ", Last Name=" + employee[2] + ", Contact=" + employee[3] + ", City= " + employee[4] + "]");
                    }
                }
                catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
