public class Laura {
    private String month, gift;
    private int day;

    public Laura(String g) {
        gift = g;
    }

    public String getGift() {return gift;}

    public void setGift(String g) {gift=g;}

    public String toString() {return "Laura "+month+" "+day+" "+gift;}
}
