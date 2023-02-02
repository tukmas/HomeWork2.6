public abstract class driver {
    private String name;
    private boolean driverLicense;
    private int experience;

    public driver(String name, boolean driverLicense, int experience) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public abstract void startMoving();
    public abstract void stop();
    public abstract void refuelTheСar();

    public abstract void driversLicenseType();
}