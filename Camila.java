public class Camila {
    private String month;
    private int day;
    private String gift;
    public Camila(String gift) {
        this.gift = gift;
    }
    public String getGift() {
        return gift;
    }
    public void setGift(String gift) {
        this.gift = gift;
    }
    public String toString() {
        return "Name: Camila, Birth Month: "+ month + ", Day: " + day + ", Gift: " + gift;
    }
}