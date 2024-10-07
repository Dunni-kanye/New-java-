package Bike;
import java.util.Scanner;

public enum GeoPoliticalZone {
    NORTHEAST("Adamawa \nBauchi \nBorno \nGombe \nTaraba \nYobe"),
    NORTHWEST("Zamfara \nSokoto \nKebbi \nKatsina \nKano \nKaduna \nJigawa"),
    NORTH_CENTRAL("Plateau \nNiger \nNasarawa \nKwara \nKogi \nFederal Capital Territory \nBenue"),
    SOUTHEAST("Imo \nEnugu \nEbony \nAnambra \nAbia"),
    SOUTH_SOUTH("Rivers \nEdo \nDelta \nCross River \nBayelsa \nAkwa Ibom"),
    SOUTHWEST("Ekiti \nLagos \nOgun \nOndo \nOsun \nOyo");
    private final String description;

    GeoPoliticalZone(String description) {
        this.description = description;
}

public String getDescription() {
    return description;
    }
    public static GeoPoliticalZone getByDescription(String description) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the geopolitical zone: ");
        String name = sc.nextLine().toUpperCase().trim();
        String zone = name.replace(" ", "_");

        try {
            GeoPoliticalZone politicalZone = GeoPoliticalZone.valueOf(zone);
            System.out.println(politicalZone.getDescription());
            return politicalZone;
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid geopolitical zone");
            return null;
        }

    }
}
