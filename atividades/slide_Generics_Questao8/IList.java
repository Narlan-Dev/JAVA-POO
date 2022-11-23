package slide_Generics_Questao8;

public interface IList<E> extends Iterable {
    int size();
	boolean isEmpty();
	boolean contains(E o);
	void add(E o);
	void remove(E o);
}
