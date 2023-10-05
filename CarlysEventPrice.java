package JavaProject;

import java.util.Scanner;

public class CarlysEventPrice {

    public static final int perPerson = 35;
    public static int guests;
    public static int totalPrice;
   

    public CarlysEventPrice() {
        this.guests = guests;
        this.totalPrice = totalPrice;
        

    }
   public static void Event (){
        if(guests >= 50 ){
            System.out.println("This is a large event");
           
        }else{ 
            System.out.println("This is NOT a large event");
          
        }
    }

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

    public static void main(String[] args) {
        CarlysEventPrice obj = new CarlysEventPrice();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of guests: ");
        obj.setGuests(sc.nextInt());
        obj.settotalPrice(totalPrice = guests * perPerson);

        
       
        System.out.println(CarlysMotto2.motto2);
        System.out.println("Number of Guests: " + obj.getGuests());
        System.out.println("Price per guest: " +perPerson );
        System.out.println("Total Price: " + obj.gettotalPrice());
        Event();
    }
}
