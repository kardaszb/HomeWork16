import java.util.Scanner;

public class Utils {

    static String readSeasonFromUser() {
        String valueFromUser;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pore roku ktorej miesiace chcesz wyświetlic ( ");
        for (Season season : Season.values()) {
            System.out.print(season.name() + " ");
        }
        System.out.println("):");
        return valueFromUser = scanner.nextLine();
    }

    static String getSeasonInfo(String valueFromUser) {
        String seasonInfo;
        return seasonInfo = Season.valueOf(valueFromUser).toString();
    }


}
