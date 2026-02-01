import java.util.Scanner;
import java.time.LocalDate;

public class TestWedding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter bride's first name: ");
        String brideFirst = input.nextLine();
        System.out.print("Enter bride's last name: ");
        String brideLast = input.nextLine();

        System.out.print("Enter groom's first name: ");
        String groomFirst = input.nextLine();
        System.out.print("Enter groom's last name: ");
        String groomLast = input.nextLine();

        Person bride = new Person(brideFirst, brideLast);
        Person groom = new Person(groomFirst, groomLast);
        Couple couple = new Couple(bride, groom);

        System.out.print("Enter wedding year (YYYY): ");
        int year = input.nextInt();
        System.out.print("Enter wedding month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter wedding day: ");
        int day = input.nextInt();
        input.nextLine(); // clear buffer

        LocalDate date = LocalDate.of(year, month, day);

        System.out.print("Enter wedding location: ");
        String location = input.nextLine();

        Wedding wedding = new Wedding(couple, date, location);

        System.out.println("\n--- Wedding Details ---");
        System.out.println("Bride: " + wedding.getCouple().getBride().getFirstName() + " "
                + wedding.getCouple().getBride().getLastName());
        System.out.println("Groom: " + wedding.getCouple().getGroom().getFirstName() + " "
                + wedding.getCouple().getGroom().getLastName());
        System.out.println("Date: " + wedding.getDate());
        System.out.println("Location: " + wedding.getLocation());
    }
}
