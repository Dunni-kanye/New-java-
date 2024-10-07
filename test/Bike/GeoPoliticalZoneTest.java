package Bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeoPoliticalZoneTest {

        @Test
        void testGetDescription() {
            assertEquals("Adamawa \nBauchi \nBorno \nGombe \nTaraba \nYobe", GeoPoliticalZone.NORTHEAST.getDescription());
            assertEquals("Ekiti \nLagos \nOgun \nOndo \nOsun \nOyo", GeoPoliticalZone.SOUTHWEST.getDescription());
        }

        @Test
        void testValidZoneInput() {
            String input = "North Central".toUpperCase().trim().replace(" ", "_");
            GeoPoliticalZone zone = GeoPoliticalZone.valueOf(input);
            assertEquals(GeoPoliticalZone.NORTH_CENTRAL, zone);
        }

        @Test
        void testInvalidZoneInput() {
            String input = "Invalid Zone".toUpperCase().trim().replace(" ", "_");
            assertThrows(IllegalArgumentException.class, () -> {
                GeoPoliticalZone.valueOf(input);
            });
        }
    }


