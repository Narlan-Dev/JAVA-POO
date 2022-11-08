package schedule;
import java.io.*;

public abstract class FileRead {
    public static void readAllFile() throws NumberFormatException, RequiredFieldExcecption, IOException{
        try {
            /*Cria um FileInputStream abrindo uma conexão com um arquivo real, o arquivo nomeado pelo nome do caminho no sistema de arquivos. 
             *Um novo objeto FileDescriptor é criado para representar essa conexão de arquivo.
             *Primeiro, se houver um gerenciador de segurança, seu método checkRead é chamado com o argumento name como argumento.
             *Se o arquivo nomeado não existir, for um diretório em vez de um arquivo normal ou, por algum outro motivo, 
             *não puder ser aberto para leitura, uma FileNotFoundException será lançada. 
            */
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
