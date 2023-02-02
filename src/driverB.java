public class driverB extends driver {
    public driverB(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В" +getName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории В" +getName() + " закончил движение");
    }

    @Override
    public void refuelTheСar() {
        System.out.println("Водитель категории В" +getName() + " нзаправляет автомобиль");
    }

    @Override
    public void driversLicenseType() {
        try {
            isDriverLicense();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Необходимо указать тип прав!");
        }
    }
}