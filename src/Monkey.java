public abstract class Monkey {

    public String name;
    public String angry;
    public int counterBanans;

    public Monkey(String name) {
        this.name = name;
    }
    public int getCatch(){
        int hvat = 1 + (int) (Math.random() * 2); //1-сильный хват, 2-нежный хват
        switch (hvat) {
            case 1:
                System.out.print("Сильный хват: ");
                break;
            case 2:
                System.out.print("Нежный хват: ");
                break;
        }
        return hvat;
    }
    public void reactionMonkey(Banana banana) { //1-спелый банан, 2-незрелый банан
        int typeBanan = banana.getTypeBanan();
        int hvat = getCatch();
        if ((hvat == 1 && typeBanan == 1) || (hvat == 2 && typeBanan == 2)) {
            angry();
        } else {
            eatBanana();

        }
    }
    public void eatBanana(){
        System.out.println(this.name + " - ест банан");
        counterBanans++;

    }

    public void angry(){
        System.out.println(this.name + this.angry);

    }
}
