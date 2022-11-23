package slide_Colecoes_Questao1;
import java.util.Scanner;

public class AppPhrase {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        Method.occurrencesWordRating(new Phrase(keyboard.nextLine()));
        Method.showWordsOccurrences();
    }
}
