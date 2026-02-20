public class Banana {

    private int typeBanan;
    public Banana(){
        runBanan();
    }
    private void runBanan() {
        typeBanan = 1 + (int) (Math.random() * 2);
        switch (typeBanan) {
            case 1:
                System.out.print("Спелый банан - ");
                break;
            case 2:
                System.out.print("Незрелый банан - ");
                break;
        }

    }

    public int getTypeBanan() {
        return typeBanan;
    }

}
