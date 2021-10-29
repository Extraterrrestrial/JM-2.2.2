package web.model;

public class Car {

    private String typeOfVehicle;

    private String model;

    private int yearOfManufacture;

    public Car() {
    }

    public Car(String typeOfVehicle, String model, int yearOfManufacture) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}