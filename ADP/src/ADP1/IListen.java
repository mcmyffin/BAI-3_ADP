package ADP1;
public interface IListen<T> {

	/**
	 * Ein Element vorne an die Liste anfügen.
	 * 
	 * @param elem
	 *            das neue Element der Liste
	 * @return void
	 */
	public void cons(T elem);

	/**
	 * Entfernt das vorderste Element der Liste.
	 * 
	 * @param
	 * @return T Gibt das gelöschte Element aus.
	 */
	public T head();

	/**
	 * Bestimmt die Länge der Liste.
	 * 
	 * @param
	 * @return int Länge der Liste.
	 */
	public int length();

	/**
	 * Prüft ob die Liste leer ist.
	 * 
	 * @return boolean
	 */
	public boolean isempty();

	/**
	 * Fügt ein neues Element an die Stelle "index" ein.
	 * 
	 * @param elem
	 *            Das neue Element
	 * @param index
	 *            Der Index an dem das neue Element eingefügt werden soll.
	 */
	public void insert(T elem, int index);

	/**
	 * Gibt den ReferenzCounter zurück.
	 * @return int referenzCounter
	 */
	public int getReferenzCounter();
	
	/**
	 * Setzt den ReferenzCounter zurück.
	 */
	public void resetReferenzCounter();
}
