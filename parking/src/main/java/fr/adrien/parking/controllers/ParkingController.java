package fr.adrien.parking.controllers;

import fr.adrien.parking.model.Parking;
import fr.adrien.parking.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * classe publique ParkingController
 */
@RestController
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    /**
     * @return la liste des parkings
     */
    @CrossOrigin("http://localhost:4200")
    @GetMapping(path = "/api/parkings")
    public List<Parking> getListeParkings(){
        return parkingService.getListeParking();
    }
}
