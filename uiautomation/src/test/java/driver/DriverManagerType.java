package driver;

public enum DriverManagerType {
    EDGE("edgedriver", "Init EdgeDiver"),
    CHROME("ChromeDriver", "Init ChromeDriver"),
    FIREFOX("firefoxdriver", "Init firefoxdriver"),
    IE("iedriver", "Init iedriver");

    private String driverName;
    private String desc;


    DriverManagerType(String driverName, String desc) {
        this.driverName = driverName;
        this.desc = desc;
    }

    public String getDriver() {
        return driverName;
    }

    public String getDriverdesc() {
        return desc;
    }

}