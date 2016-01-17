package pl.augustyn.carinfoandroid;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by patry on 16.01.2016.
 */
public class Car implements Serializable {
    private String manufacturer;
    private String model;
    private Date production;
    private Date insuranceEnd;
    private Date technicalEnd;

    public Car(String manufacturer, String model, Date production, Date insuranceEnd, Date technicalEnd) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.production = production;
        this.insuranceEnd = insuranceEnd;
        this.technicalEnd = technicalEnd;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Date getProduction() {
        return production;
    }

    public Date getInsuranceEnd() {
        return insuranceEnd;
    }

    public Date getTechnicalEnd() {
        return technicalEnd;
    }
}
