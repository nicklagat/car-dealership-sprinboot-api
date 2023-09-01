package cardealership.cardealership.service.electricVehicle;

import cardealership.cardealership.model.ElectricVehicle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ElectricVehicleServiceImpl implements ElectricVehicleService {


    // This method creates and returns a dummy Electric Vehicle for demonstration purposes.
    private ElectricVehicle getDummyEv() {
        UUID evId = UUID.randomUUID();
        return ElectricVehicle.builder()
                .evId(evId.toString())
                .evMake("Tesla")
                .evModel("Model Y")
                .evRange("370 Miles")
                .evBatteryCapacity("230 kWh")
                .evPrice("$45999")
                .build();
    }


    private ElectricVehicle getDummyEv1(String evMake, String evModel, String evRange, String evBatteryCapacity, String evPrice) {
        UUID evId1 = UUID.randomUUID();
        return ElectricVehicle.builder()
                .evId(evId1.toString())
                .evMake(evMake)
                .evModel(evModel)
                .evRange(evRange)
                .evBatteryCapacity(evBatteryCapacity)
                .evPrice(evPrice)
                .build();
    }


    // This method returns a list of dummy Electric Vehicles for demonstration purposes.
    private List<ElectricVehicle> allEvs() {
        List<ElectricVehicle> ev = new ArrayList<>();
        ev.add(getDummyEv1("Tesla", "Model S", "370 Miles", "230 kWh", "$45999"));
        ev.add(getDummyEv1("Tesla", "Model X", "400 Miles", "250 kWh", "$60000"));
        ev.add(getDummyEv1("Tesla", "Model 3", "350 Miles", "220 kWh", "$35000"));
        ev.add(getDummyEv1("Tesla", "Model Y", "420 Miles", "240 kWh", "$49000"));
        ev.add(getDummyEv1("Tesla", "Roadster", "620 Miles", "280 kWh", "$120000"));
        ev.add(getDummyEv1("Tesla", "Cybertruck", "500 Miles", "260 kWh", "$70000"));


        return ev;
    }

    @Override
    public ElectricVehicle getEvById(String id) {
        return getDummyEv();
    }

    @Override
    public void deleteEvById(String id) {

    }

    @Override
    public ElectricVehicle createEv(ElectricVehicle electricVehicle) {
        return electricVehicle;
    }

    @Override
    public List<ElectricVehicle> getEvs() {
        return allEvs();
    }
}
