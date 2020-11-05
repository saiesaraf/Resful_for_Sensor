package com.example.Resful_for_Sensor.SensorPackage;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SensorRepository extends MongoRepository<Sensor,String> {

    List<Sensor> findAll();

    List<Sensor> findBySensorId(int sensorId);

    Sensor save(Sensor sensor);


}
