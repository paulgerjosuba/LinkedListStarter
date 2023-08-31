public interface LinkedListInterface<E> {

    public void add (E e);
    public void clear();
    public E get (int index) throws ListEmptyException;
    public int size();
    public boolean isEmpty();

}
