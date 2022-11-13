package org.usach.relationshipexamples.taxi;

import java.util.List;

public class TaxiService {

    private String carModel;

    private List<Person> passengers;

    private Driver driver;

    public TaxiService(String carModel) {
        this.carModel = carModel;
    }

    // Association: lifecycles are not tied
    public void setPassengers(List<Person> passengers) {
        this.passengers = passengers;
    }

    // Association: lifecycles are not tied
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
