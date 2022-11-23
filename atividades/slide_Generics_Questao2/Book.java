package slide_Generics_Questao2;

public class Book implements Media{
    private String title;
    private String author;

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}
