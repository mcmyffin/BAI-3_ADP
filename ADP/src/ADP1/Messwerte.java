package ADP1;

import java.util.ArrayList;
import java.util.List;

public class Messwerte {

	List<Double> _messwerteList = new ArrayList<Double>();
	double _mittelwert = 0;


	/**
	 * Fügt einen neuen Messwert hinzu.
	 * 
	 * @param num
	 *            neuer Messwert
	 * @return void
	 */
	public void add(double num) {
		_messwerteList.add(num);
	}

	/**
	 * Berechnet den Mittelwert.
	 * 
	 * @return berechneter Mittelwert
	 */
	public double calculateMittelwert() {

		for (double e : _messwerteList) 
		{
			_mittelwert += e;
		}
		_mittelwert = _mittelwert / _messwerteList.size();
		System.out.println("Mittelwert: " + _mittelwert);
		return _mittelwert;
	}


}
