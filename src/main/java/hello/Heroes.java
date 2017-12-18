package hello;

public class Heroes {

    private final long id;
    private final String name;
    private final String hardCounterIds;
    private final String softCounterIds;

    public Heroes() {
        this.id = 1;
        this.name = "Bastion";
        this.hardCounterIds = "5,10,11";
        this.softCounterIds = "2,5";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return name;
    }

    public String getHardCounters() {
        return hardCounterIds;
    }

    public String getSoftCounters() {
        return softCounterIds;
    }
}