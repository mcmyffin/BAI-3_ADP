package ADP1;


public class Listen<T> implements IListen<T> {

	private ListElem<T> _head;
	private int _referenzCounter = 0;

	@Override
	public void cons(T elem) {
		ListElem<T> newElem = new ListElem<T>(elem);
		ListElem<T> tmp = _head; // den alten head "zwischen speichern"
		_head = newElem; // das neue Element als head defenieren
		_head.setNextElem(tmp); // den alten head also nachfolger des neuen
								// Elements setzen
	}

	@Override
	public T head() {
		if (_head == null)
			return null;
		ListElem<T> newHead = _head.getNextElem(); //
		T tmp = _head.getObj();
		_head = newHead; //der head wird durch seinen nachfolger ersetzt
		return tmp;	//das "gelöschte" Element wird ausgegeben
	}

	@Override
	public int length() {
		if (_head == null)
			return 0;
		ListElem<T> current = _head;
		int length = 1;
		while (current.hasNext()) {	//solange die liste nicht leer ist
			length++;				//Zähler hochzählen
			current = current.getNextElem();
		}
		return length;
	}

	@Override
	public boolean isempty() {
		return _head == null;
	}

	@Override
	public void insert(T elem, int index) {
		ListElem<T> newElem = new ListElem<T>(elem);
		if (index < 0) {
			throw new IndexOutOfBoundsException(
					"Index darf nicht kleiner 0 sein!");
		} else if (index > length()) {
			throw new IndexOutOfBoundsException("Index zu groß!");
		} else if (_head == null) {
			_head = newElem;
		} else {
			ListElem<T> current = _head.getNextElem();
			ListElem<T> previous = _head;
			int position = 1;
			while (position < index) { //bis der Index erreicht wird
				previous = current;
				current = current.getNextElem();
				position++;
			}
			previous.setNextElem(newElem);	//neues Element "einfügen"
			newElem.setNextElem(current);	//nachfolger des neuen Elements setzen
		}
	}

	@Override
	public int getReferenzCounter() {
		return _referenzCounter;
	}

	@Override
	public void resetReferenzCounter() {
		_referenzCounter = 0;

	}
}
