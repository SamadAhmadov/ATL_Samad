package Enums;

public enum Seasons {
    WINTER(7, -3,"Coldest season"),
    SPRING(22, 5, "Warm season"),
    SUMMER(42, 23,"Hottest season"),
    AUTUMN(27, 13,"Rainy season");

    private final int maxTemp;
    private final int minTemp;
    private final String description;

    Seasons(int maxTemp, int minTemp, String description) {
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.description = description;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public String getDescription() {
        return description;
    }

    public String getFormatInfo(){
        return "Season: " + this.name() +
                " | Max Temp: " + maxTemp + "°C" +
                " | Min Temp: " + minTemp + "°C" +
                " | Description: " + description;
    }
}