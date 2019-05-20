package com.wong.gps.dto;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "gps")
public class GpsDTO implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long seq;

    private String name;

    private long duration;

    private String nowLocation;

    public  GpsDTO(){}
    public GpsDTO(String name, long duration, String nowLocation){
        this.name=name;
        this.duration=duration;
        this.nowLocation=nowLocation;
    }

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getNowLocation() {
        return nowLocation;
    }

    public void setNowLocation(String nowLocation) {
        this.nowLocation = nowLocation;
    }
}
