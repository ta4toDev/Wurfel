public class Wuerfel {

    public int wurf(){ // Diese Methode ist öffentlich (public), was bedeutet, dass sie von jeder anderen Klasse aufgerufen werden kann. Sie gibt einen int zurück, also eine ganze Zahl, die das Ergebnis des Würfelwurfs darstellt.
        //int wurf;
        //wurf = (int)(Math.random() * 6) +1; //Zufallszahl vordefinieren
        //return wurf;
        return (int)(Math.random() *6) +1; //Diese Zeile ist der Kern der Methode und erzeugt das Ergebnis des Würfelwurfs.

    }

}
