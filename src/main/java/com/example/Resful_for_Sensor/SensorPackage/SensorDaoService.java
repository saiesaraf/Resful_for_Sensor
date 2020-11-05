package com.example.Resful_for_Sensor.SensorPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class SensorDaoService {
    @Autowired
    private SensorRepository repository;
    private static List<Sensor> sensors = new ArrayList<>();


    List<Sensor> findAllSensors(){
        return repository.findAll();
    }

    public List<Sensor> findOne(int sensorId) {
      return repository.findBySensorId(sensorId);
    }

    Sensor save(Sensor sensor){
        Sensor savedSensor = repository.save(sensor);
        return savedSensor;
    }


}
