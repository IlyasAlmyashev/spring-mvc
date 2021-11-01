package web.model;

public class Car {

    private final int carID;
    private String manufacturer;
    private String model;

    public Car(int carID, String manufacturer, String model) {
        this.carID = carID;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public int getCarID() {
        return carID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}