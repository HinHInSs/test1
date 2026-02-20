
public class Main {
    public static void main(String[] args) {

        Gibbon myGibbon = new Gibbon();
        Gorilla myGorilla = new Gorilla();
        Martyshka myMartishka = new Martyshka();
        GenBananMonkeys genBananMonkeys = new GenBananMonkeys();
        Monkey[] monkeys = new Monkey[]{myGorilla, myGibbon, myMartishka};
        genBananMonkeys.selectMonkey(monkeys, 5);
        genBananMonkeys.resultsReport(monkeys);

    }
}