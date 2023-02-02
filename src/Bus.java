public class Bus  extends Transport <driverD>{
    private int weight;
    private  int numberOfWheels;
    private String equipment;
    private String color;

    public enum capacity {
        ESPECIALLY_SMALL ("до 10 мест"),
        SMALL ("до 25 мест"),
        AVERAGE ("40–50 мест"),
        BIG ("60–80 мест"),
        EXTRA_LARGE ("100–120 мест");
        public final String capacity1;

        capacity (String capacity1){
            this.capacity1 = capacity1;
        }
        public String getcapacity1() {
            return capacity1;
        }
        @Override
        public String toString() {
            return "Вместимость: " + getcapacity1();
        }
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bus(String brand, String model, float engineVolume, driverD driver, int weight, int numberOfWheels, String equipment, String color) {
        super(brand, model, engineVolume, driver);
        if (weight >= 3000) {
            this.weight = weight;
        } else {
            this.weight = 15000;
        }
        if (numberOfWheels >= 4) {
            this.numberOfWheels = numberOfWheels;
        } else {
            this.numberOfWheels = 8;
        }
        if (equipment != null) {
            this.equipment = equipment;
        } else {
            this.equipment = "Базовая";
        }
        if (color != null) {
            this.color = color;
        } else {
            this.color = "Белый";
        }
    }
    @Override
    public void movement() {
        System.out.println("Автобус марки " + getBrand() +  " начал движение");
    }

    @Override
    public void movement1() {
        System.out.println("Автобус марки " + getBrand() +  " закончил движение");
    }

    @Override
    public void PitStop(String PitStop) {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void BestLapTime(String BestLapTime) {
        System.out.println("Лучшее время круга у автобуса");
    }

    @Override
    public void MaxSpeed(String MaxSpeed) {
        System.out.println("Максимальная скорость у автобуса");
    }
    @Override
    public void printType() {
        System.out.println("Данных по транспортному средству недостаточно");
    }

    @Override
    public void PassDiagnostics() throws RuntimeException {
        throw new RuntimeException("Автобусы диагностику проходить не могу" + getBrand());
    }
}