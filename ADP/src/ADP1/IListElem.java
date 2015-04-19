package ADP1;


public interface IListElem<T> {

    public void setNextElem(ListElem<T> nextElem);

    public ListElem<T> getNextElem();

    public T getObj();

    public boolean hasNext();
}
