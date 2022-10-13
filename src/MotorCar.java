public class MotorCar extends Car {
    private boolean isDiagnostic;


    public MotorCar(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public boolean performDiagnostic() {
        return this.isDiagnostic = true;
    }


    public void startMoving() {
        System.out.println("Я начинаю движение на легковом авто");
    }

    public void finishMoving() {
        System.out.println("Я остановился на легковом авто");
    }

    @Override
    public boolean isDiagnostic() {
        if (this.isDiagnostic == false) {
            throw new RuntimeException("Диагностика не проведена");
        }
        return isDiagnostic;
    }
}
