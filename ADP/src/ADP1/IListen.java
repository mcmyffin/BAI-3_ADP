package ADP1;
public interface IListen<T> {

	/**
	 * Ein Element vorne an die Liste anf�gen.
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
	 * @return T Gibt das gel�schte Element aus.
	 */
	public T head();

	/**
	 * Bestimmt die L�nge der Liste.
	 * 
	 * @param
	 * @return int L�nge der Liste.
	 */
	public int length();

	/**
	 * Pr�ft ob die Liste leer ist.
	 * 
	 * @return boolean
	 */
	public boolean isempty();

	/**
	 * F�gt ein neues Element an die Stelle "index" ein.
	 * 
	 * @param elem
	 *            Das neue Element
	 * @param index
	 *            Der Index an dem das neue Element eingef�gt werden soll.
	 */
	public void insert(T elem, int index);

	/**
	 * Gibt den ReferenzCounter zur�ck.
	 * @return int referenzCounter
	 */
	public int getReferenzCounter();
	
	/**
	 * Setzt den ReferenzCounter zur�ck.
	 */
	public void resetReferenzCounter();
}
