package JavaProject;

public class Event {

    public final static int perGuest = 35;
    public final static int cutoff = 50;

    private static String eventNum;
    private static int numGuests;
    private static int price;

    public void setEventNumber(String eventNum) {
        this.eventNum = eventNum;
    }

    public void setGuests(int numGuests) {
        this.numGuests = numGuests;
        this.price = numGuests * perGuest;

    }

    public String getEventNumber() {
        return eventNum;

    }

    public int getGuests() {
        return numGuests;

    }

    public int getprice() {
        return price;
    }
}
