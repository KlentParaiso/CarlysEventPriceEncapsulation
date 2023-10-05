package JavaProject;

import static JavaProject.CarlysEventPrice.guests;
import static JavaProject.CarlysEventPrice.perPerson;
import static JavaProject.CarlysEventPrice.totalPrice;
import java.util.Scanner;

public class CarlysEventPriceWithMethods {

    public static final int perPerson = 35;
    public static int guests;
    public static int totalPrice;

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public void settotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getGuests() {
        return guests;
    }

    public int gettotalPrice() {
        return totalPrice;

    }

    public static void guests() {
        CarlysEventPriceWithMethods obj = new CarlysEventPriceWithMethods();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Guests: ");
        obj.setGuests(sc.nextInt());
        //System.out.println("Number of Guests: " + obj.getGuests());
    }

    public static void motto() {
        System.out.println(CarlysMotto2.motto2);
    }

    public static void dislay() {
        CarlysEventPriceWithMethods obj = new CarlysEventPriceWithMethods();
        Scanner sc = new Scanner(System.in);
        obj.settotalPrice(totalPrice = guests * perPerson);
        System.out.println("Total Price: " + obj.gettotalPrice());
        if (guests >= 50) {
            System.out.println("This is a large event.");

        } else {
            System.out.println("This is NOT a large event.");

        }
    }

    public static void main(String[] args) {
        guests();
        motto();
        dislay();

    }
}
