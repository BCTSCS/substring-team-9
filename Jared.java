public class Jared {
    private String month;
    private int day;
    private String gift;

    public Jared(String gift){
        this.gift = gift;
    }

    public String getGift(){
        return gift;
    }

    public void setGift(String gift){
        this.gift = gift;
    }

    public String toString(){
        return "Month: "+ month + ", Day: " + day + ", Gift: " + gift;
    }
}