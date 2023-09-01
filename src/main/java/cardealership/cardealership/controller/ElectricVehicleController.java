package cardealership.cardealership.controller;

import cardealership.cardealership.model.ElectricVehicle;
import cardealership.cardealership.service.electricVehicle.ElectricVehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

// This controller handles all operations related to Electric Vehicles.
@RestController
@RequestMapping("/electric-vehicles")
public class ElectricVehicleController {

    private final ElectricVehicleService electricVehicleService;

    public ElectricVehicleController(ElectricVehicleService electricVehicleService) {
        this.electricVehicleService = electricVehicleService;
    }

    // Endpoint to fetch an Electric Vehicle by its unique ID.
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ElectricVehicle> getEvById(@PathVariable String id) {
        // For demonstration, returning a dummy Electric Vehicle.
        return ResponseEntity.ok(electricVehicleService.getEvById(id));
    }

    // Endpoint to create a new Electric Vehicle.
    @PostMapping
    public ResponseEntity<ElectricVehicle> createEv(@RequestBody ElectricVehicle electricVehicle) {

        // Generating a unique ID for the new Electric Vehicle.
        UUID evId = UUID.randomUUID();
        electricVehicle.setEvId(evId.toString());

        // Returning the created Electric Vehicle with a '201 Created' status.
        return ResponseEntity.status(HttpStatus.CREATED).body(electricVehicle);
    }

    // Endpoint to delete an Electric Vehicle by its unique ID.
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEv(@PathVariable String id) {
        // For demonstration, returning a success message without actual deletion.
        return ResponseEntity.ok("Successfully deleted the given Electric Vehicle " + id);
    }

    // Endpoint to fetch all Electric Vehicles.
    @GetMapping
    public ResponseEntity<List<ElectricVehicle>> getAllEvs() {
        // For demonstration, returning a list of dummy Electric Vehicles.
        return ResponseEntity.ok(electricVehicleService.getEvs());
    }

}
