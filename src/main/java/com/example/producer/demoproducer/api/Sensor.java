package com.example.producer.demoproducer.api;

import java.util.List;

public class Sensor {

    private  Metadata metadata;
    private  String id;
    private  float acceleration;
    private  float velocity;
    private  float internalTemperature;
    private  float externalTemperature;
    private  float accelerometer;
    private  float magneticField;

    public float getAccelerometer() {
        return accelerometer;
    }

    public float getMagneticField() {
        return magneticField;
    }

    public void setAccelerometer(float accelerometer) {
        this.accelerometer = accelerometer;
    }

    public void setMagneticField(float magneticField) {
        this.magneticField = magneticField;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public String getId() {
        return id;
    }

    public float getVelocity() {
        return velocity;
    }

    public float getInternalTemperature() {
        return internalTemperature;
    }

    public float getExternalTemperature() {
        return externalTemperature;
    }

    public void setExternalTemperature(float externalTemperature) { this.externalTemperature = externalTemperature; }

    public void setId(String id) {
        this.id = id;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public void setInternalTemperature(float internalTemperature) {
        this.internalTemperature = internalTemperature;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "metadata=" + metadata +
                ", id='" + id + '\'' +
                ", acceleration=" + acceleration +
                ", velocity=" + velocity +
                ", internalTemperature=" + internalTemperature +
                ", externalTemperature=" + externalTemperature +
                ", accelerometer=" + accelerometer +
                ", magneticField=" + magneticField +
                '}';
    }
}
