package com.example.producer.demoproducer.producer;

import com.example.producer.demoproducer.api.Metadata;
import com.example.producer.demoproducer.api.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.UUID;

@EnableBinding(Source.class)
@RestController
public class ConfluentAvroProducer {

    @Autowired
    private Source source;

    private Random random = new Random();

    int counter = 0;

    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    public String sendMessage() {
        source.output().send(MessageBuilder.withPayload(randomSensor()).build());
        System.out.println("Sent completed !!");
        return "ok, have fun with v2 payload!";
    }

    private Sensor randomSensor() {
        Sensor sensor = new Sensor();
        sensor.setMetadata(createMetadata());
        sensor.setId(UUID.randomUUID().toString() + "-v"+counter);
        sensor.setAcceleration(random.nextFloat() * 10);
        sensor.setVelocity(random.nextFloat() * 100);
        sensor.setInternalTemperature(random.nextFloat() * 50);
        sensor.setAccelerometer(random.nextFloat() * 60);
        sensor.setMagneticField(random.nextFloat() * 70);
        sensor.setExternalTemperature(random.nextFloat() * 80);
        return sensor;
    }

    private Metadata createMetadata() {
        Metadata metadata = new Metadata();
        metadata.setCorrelationid("xxsd949000idasda-23wrkalsldflsf-V"+counter);
        metadata.setVersion("V"+counter++);
        metadata.setSource("demo");
        metadata.setType("Just a demo");
        metadata.setTime("today");
        return metadata;
    }
}
