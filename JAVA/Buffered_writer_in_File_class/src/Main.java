import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
            System.out.println("Enter names : ");
            String nm = br.readLine();
            while(true){
                if(nm.equals("end")){
                    break;
                }
                bw.write(nm + "\n");
                nm = br.readLine();
            }
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}