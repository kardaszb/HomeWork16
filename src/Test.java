public class Test {
    public static void main(String[] args) {
        String seasonValueFromUser;
        String seasonInfo;

        seasonValueFromUser = Utils.readSeasonFromUser();
        seasonInfo = Utils.getSeasonInfo(seasonValueFromUser);

        System.out.println(seasonInfo);
    }
}