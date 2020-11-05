package com.example.Resful_for_Sensor.SensorPackage;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@SuppressWarnings("unchecked")
@Document(collection = "temperatureNew")
public class Sensor {

    @Id
    public ObjectId _id;

    public String temp;

    public String topic;

    public Integer quality;

    public int sensorId;

    public Sensor(ObjectId _id,int sensorId, String temp, String topic, Integer quality) {
        this._id = _id;
        this.sensorId = sensorId;
        this.temp = temp;
        this.topic = topic;
        this.quality = quality;
    }

    public int getSensorId() {
        return sensorId;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }
}
