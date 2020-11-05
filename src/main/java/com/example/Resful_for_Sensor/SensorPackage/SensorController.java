package com.example.Resful_for_Sensor.SensorPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class SensorController {

    @Autowired
    SensorDaoService service;


    @GetMapping("/sensors")
    public List<Sensor> retriveSensors(){
        return service.findAllSensors();
    }

    @GetMapping("/sensors/{id}")
    public List<Sensor> retriveSensor(@PathVariable int id){
        return service.findOne(id);
    }

    @PostMapping("/sensors")
    public ResponseEntity<Object> createSensor(@RequestBody Sensor sensor){
        Sensor savedSensor = service.save(sensor);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedSensor.getSensorId()).toUri();
        return ResponseEntity.created(location).build();

    }


}
