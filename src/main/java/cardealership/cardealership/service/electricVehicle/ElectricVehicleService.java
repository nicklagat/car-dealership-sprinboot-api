package cardealership.cardealership.service.electricVehicle;

import cardealership.cardealership.model.ElectricVehicle;

import java.util.List;

public interface ElectricVehicleService {

    ElectricVehicle getEvById(String id);

    void deleteEvById(String id);

    ElectricVehicle createEv(ElectricVehicle electricVehicle);

    List<ElectricVehicle> getEvs();


}
