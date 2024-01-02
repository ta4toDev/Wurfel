public class Main{

   /* public static void main(String[] args) {
        Wuerfel w = new Wuerfel(); //Erstellt ein neues Objekt w der Klasse
        int anzahl6 = 0; //Initialisiert eine Variable anzahl6,
        int anzahlNicht6 = 0;//Initialisiert eine Variable anzahlNicht6,
        for (int i = 1; i<=100; i++){ //Eine Schleife, die 100-mal durchlaufen wird. Sie simuliert 100 Würfelwürfe.
            int erg = w.wurf(); //In jedem Durchlauf der Schleife wird die wurf()-Methode des Würfelobjekts w aufgerufen. Das Ergebnis des Würfelwurfs wird in der Variable erg gespeichert.
            if (erg == 6){ //Überprüft, ob das Würfelergebnis 6 ist
                anzahl6++; //Wenn das Ergebnis 6 ist, wird anzahl6 um 1 erhöht.
            } else {//Wenn das Würfelergebnis nicht 6 ist
                anzahlNicht6++;//Erhöht anzahlNicht6 um 1.
            }
        }
        System.out.println("Anzahl 6 :"+ anzahl6); //gibt die Gesamtanzahl der Würfe aus, die eine 6 ergeben haben.
        System.out.println("Anzahl nicht 6: "+ anzahlNicht6);//Gibt die Gesamtanzahl der Würfe aus, die nicht 6 ergeben haben.
    }*/

    public static void main(String[] args) {
        Worker w = new Worker();
        w.howManyNonStatic();
        Worker.howMany();


        Wuerfel w1 = new Wuerfel();
        Wuerfel w2 = new Wuerfel();
        //comments

        //comments
        Worker.paschKurz(w1.wurf(),w2.wurf());
        Worker.bisZumPaschUndDarueberHinaus();
        Worker.augenzaehlerBisHundert();

        //helloworld Method
        printHelloWorld();

    }

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }
}
