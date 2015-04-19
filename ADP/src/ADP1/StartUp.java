package ADP1;

public class StartUp {

    public static void main(String[] args) {

        Messwerte adp = new Messwerte();
        adp.add(5);
        adp.add(6);
        adp.add(4);
        adp.calculateMittelwert();
 
    }

}
