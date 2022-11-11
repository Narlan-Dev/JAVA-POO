package slide_Generics_Questao2;

public class AppLibraly {
    public static void main(String[] args){
        Libraly<Media> libraly = new Libraly<>();

        try {
            libraly.add(new Book("qualquer", "noia"));
            libraly.add(new Book("outro", "noia"));
        } catch (FullStackException e) {
            e.printStackTrace();
        }
        
        System.out.println(libraly.retrieveLast().getTitle());
    }
}
