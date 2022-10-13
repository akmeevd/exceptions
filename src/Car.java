public class Car {
    private String brand;
    private String model;
    private Double engineVolume;

    private boolean isDiagnostic;


    public Car(String brand, String model, Double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public boolean performDiagnostic() {
        return this.isDiagnostic = true;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public boolean isDiagnostic() {
        return isDiagnostic;
    }
}
