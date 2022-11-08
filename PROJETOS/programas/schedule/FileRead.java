package schedule;
import java.io.*;

public abstract class FileRead {
    public static void readAllFile() throws NumberFormatException, RequiredFieldExcecption, IOException{
        try {
            BufferedReader br =  new BufferedReader(new InputStreamReader(new FileInputStream("schedule/DAO.txt")));

            while(br.ready()){
                String linha[] = br.readLine().split(";");
                Registration.add(new Client(linha[0], linha[1], linha[2], Integer.parseInt(linha[3])));
            }
            br.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
