package com.example.producer.demoproducer.api;

public class Metadata {
    private  String version;
    private  String type;
    private  String source;
    private  String correlationid;
    private  String time;

    public String getVersion() {
        return version;
    }

    public String getType() {
        return type;
    }

    public String getSource() {
        return source;
    }

    public String getCorrelationid() {
        return correlationid;
    }

    public String getTime() {
        return time;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setCorrelationid(String correlationid) {
        this.correlationid = correlationid;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "version='" + version + '\'' +
                ", type='" + type + '\'' +
                ", source='" + source + '\'' +
                ", correlationid='" + correlationid + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
