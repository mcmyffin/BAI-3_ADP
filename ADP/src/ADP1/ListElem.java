package ADP1;


public class ListElem<T> implements IListElem<T> {

    T _obj;
    ListElem<T> _nextElem;

    public ListElem(T obj) {
        this._obj = obj;
        _nextElem = null;
    }

    @Override
    public void setNextElem(ListElem<T> nextElem) {
        this._nextElem = nextElem;
    }

    @Override
    public ListElem<T> getNextElem() {
        return _nextElem;
    }

    public boolean hasNext() {
        return getNextElem() != null;
    }

    @Override
    public T getObj() {
        return _obj;
    }
}
