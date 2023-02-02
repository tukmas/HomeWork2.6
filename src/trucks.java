public class trucks extends Transport <driverC>{
    private int loadClass;
    private int height;
    private String fuelType;
    private int numberOfAxles;

    public enum loadCapacity {
        N1 ("с полной массой до 3,5 тонн"),
        N2 ("с полной массой свыше 3,5 до 12 тонн"),
        N3 ("(с полной массой свыше 12 тонн");
        private final String Capacity;
        loadCapacity (String Type){
            this.Capacity = Type;
        }
        public String getCapacity() {
            return Capacity;
        }
        @Override
        public String toString() {
            return "Грузоподъемность: " + getCapacity();
        }
    }

    public int getLoadClass() {
        return loadClass;
    }

    public int getHeight() {
        return height;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public trucks(String brand, String model, float engineVolume, driverC driver, int loadClass, int height, String fuelType, int numberOfAxles) {
        super(brand, model, engineVolume, driver);
        if (loadClass != 0){
            this.loadClass = loadClass;
        } else {
            this.loadClass = 1;
        }
        if (height != 0){
            this.height = height;
        }else {
            this.height = 1750;
        }
        if (fuelType != null){
            this.fuelType = fuelType;
        }else {
            this.fuelType = "Газ";
        }
        if (numberOfAxles >1){
            this.numberOfAxles = numberOfAxles;
        }else this.numberOfAxles = 3;
    }
    @Override
    public void movement() {
        System.out.println("Грузовой автомобиль марки " + getBrand() +  " начал движение");
    }

    @Override
    public void movement1() {
        System.out.println("Грузовой автомобиль марки " + getBrand() +  " закончил движение");
    }

    @Override
    public void PitStop(String PitStop) {
        System.out.println("Пит-стоп у грузового автомобиля");
    }

    @Override
    public void BestLapTime(String BestLapTime) {
        System.out.println("Лучшее время круга у грузового автомобиля");
    }

    @Override
    public void MaxSpeed(String MaxSpeed) {
        System.out.println("Максимальная скорость у грузового автомобиля");
    }
    @Override
    public void printType() {
        System.out.println("Данных по транспортному средству недостаточно");
    }

    @Override
    public void PassDiagnostics() {
        System.out.println("Грузовой автомобиль проходит диагностику");
    }
}
