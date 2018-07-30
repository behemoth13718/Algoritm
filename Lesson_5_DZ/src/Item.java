public class Item {


    private String NAME;
    public int WEIGTH;
    private int PRICE;

    public Item(String NAME, int WEIGTH, int PRICE) {
        this.NAME = NAME;
        this.WEIGTH = WEIGTH;
        this.PRICE = PRICE;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setWEIGTH(int WEIGTH) {
        this.WEIGTH = WEIGTH;
    }

    public void setPRICE(int PRICE) {
        this.PRICE = PRICE;
    }

    public String getNAME() {
        return NAME;
    }

    public int getWEIGTH() {
        return WEIGTH;
    }

    public int getPRICE() {
        return PRICE;
    }

    @Override
    public String toString() {
        return "Предметы : " + "Название = " + NAME + "," + " Цена = " + PRICE + "," + " Вес = " + WEIGTH +  "\n";
    }
}
