public class Bus extends Car {

    public Bus(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }



    public void startMoving() {
        System.out.println("Я начинаю движение на автобусе");
    }

    public void finishMoving() {
        System.out.println("Я остановился на автобусе");
    }

}

