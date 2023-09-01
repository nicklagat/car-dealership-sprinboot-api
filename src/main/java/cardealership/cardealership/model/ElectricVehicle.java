package cardealership.cardealership.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ElectricVehicle {

    private String evId;
    private String evMake;
    private String evModel;
    private String evBatteryCapacity;
    private String evRange;
    private String evPrice;
}
