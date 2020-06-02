import java.util.Scanner;

public class ReadFromUser {

    static Season readSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pore roku ktorej miesiace chcesz wyświetlic ( ");
        for (Season season : Season.values()) {
            System.out.print(season.name() + " ");
        }
        System.out.println("):");
        String valueFromUser = scanner.nextLine();
        return Season.valueOf(valueFromUser);
    }

}
