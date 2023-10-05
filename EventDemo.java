package JavaProject;

import java.util.Scanner;

public class EventDemo {

    public static void eventNum() {
        Event event = new Event();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Event Number:");
        event.setEventNumber(sc.nextLine());
        
        

    }
    public static void Eventdetails (){
          Event event = new Event();
        CarlysEventPriceWithMethods obj = new CarlysEventPriceWithMethods();
        CarlysEventPriceWithMethods methods = new CarlysEventPriceWithMethods();
        methods.motto();        
        eventNum();
        
        obj.guests();
        System.out.println("");
        System.out.println("Event Number: " + event.getEventNumber());
        System.out.println("Number of Guests: " + obj.getGuests());
          System.out.println("Price Per Guest: $"+Event.perGuest);
       
        methods.dislay();
    }

    public static void main(String[] args) {
        Eventdetails();
    }
}
