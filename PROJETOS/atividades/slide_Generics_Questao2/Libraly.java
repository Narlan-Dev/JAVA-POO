package slide_Generics_Questao2;

public class Libraly<L> {
    private  final int size = 100;
    private  int top;
    private L[] resources = (L[]) new Object[size];

    public void add(L element) throws FullStackException{
        if(top ==  size - 1){
            throw new  FullStackException();
        }
        resources[++top] = element;
    }
    public L retrieveLast(){
        if(top > 0){
            return resources[top];
        }
        return null;
    }
}
