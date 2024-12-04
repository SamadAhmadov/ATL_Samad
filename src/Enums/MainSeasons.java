package Enums;

public class MainSeasons {
    public static void main(String[] args) {

        for (Seasons season : Seasons.values()) {
            System.out.println(season.getFormatInfo());
        }
    }
}