package schedule;
import java.io.*;
import java.util.*;

public abstract class FileWrite {
    public static void writeAllFile(Map customers) throws IOException{
        Map<Client, String> copy = new HashMap<>();
        copy.putAll(customers);
        try{
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("schedule/DAO.txt")));
            
            bw.flush();
            for(Client customer : copy.keySet()){
                bw.write(customer.getName()+";"+customer.getPhone()+";"+customer.getDescription()+";"+customer.getId());
            }
            bw.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
