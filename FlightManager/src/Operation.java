import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Operation {

    Scanner scanner=new Scanner(System.in);
    public void start() {
        passenger();
        booking();
    }

    private void booking() {
        System.out.println("choose your ticket type by inserting 1 or 2");
        System.out.println("1 for Business ticket or 2 for economy ticket ");
        int choice=0;
        choice=scanner.nextInt();
        switch (choice){
            case 1:
                business();
                break;
            case 2:
                economy();
                break;
            default:
                System.exit(0);
        }
    }

    public void business() {
        businessMenu();
        businessTicket();
    }

    public void economy(){

    }

    public void businessTicket() {
        List<Ticket> tickets=new ArrayList<>();
        Ticket ticket=new Ticket();
        ticket.setTicketId("Bt01");
        ticket.setCost(5000.0);
        ticket.setTicketType("Business Class");
        tickets.add(ticket);
    }


    public void businessMenu() {
        List<Food> foods=new ArrayList<>();
        Food food=new Food();
        food.setFoodName("Lax");
        food.setPrice(550.0);
        foods.add(food);

        Food food1=new Food("Tanduahri", 400.0);
        foods.add(food1);

        Food food2=new Food("Mai Thai", 780.0);
        foods.add(food2);

        Food food3=new Food("Gin", 150.0);
        foods.add(food3);
    }



    public void passenger(){

        List<Passenger> passengers=new ArrayList<>();
        Passenger passenger=new Passenger();

        System.out.println("Enter your first Name: ");
        passenger.setFirstName(scanner.nextLine());

        System.out.println("Enter your last Name: ");
        passenger.setLastName(scanner.nextLine());

        System.out.println("Enter your date of birth: ");
        passenger.setDob(scanner.nextLine());

        passengers.add(passenger);
    }
}
