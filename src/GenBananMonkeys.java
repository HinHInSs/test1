public class GenBananMonkeys {
    public void selectMonkey(Monkey[] monkey, int val) {
        for (int i = 0; i < monkey.length; ++i) {
            for (int j = 0; j < val; ++j) {
                Banana banana = new Banana();
                monkey[i].reactionMonkey(banana);
            }

        }
    }

    public void resultsReport(Monkey[] monkey){
        System.out.println(" === Отчет о сьеденых бананах === ");
        for (int i = 0; i < monkey.length; i++) {
            System.out.println(monkey[i].name + " сьел " + monkey[i].counterBanans + " банана.");
        }
    }

}
