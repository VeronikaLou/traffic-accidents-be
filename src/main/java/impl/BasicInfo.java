package impl;

public class BasicInfo {
    private String name;
    private int accidentCount;
    private int deathsCount;
    private String mainCause;
    private String cause;


    public BasicInfo(String name, int deathsCount, String mainCause, String cause, int accidentCause) {
        this.name = name;
        this.deathsCount = deathsCount;
        this.mainCause = mainCause;
        this.accidentCount = accidentCause;
        this.cause = cause;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeathsCount() {
        return deathsCount;
    }

    public void setDeathsCount(int deathsCount) {
        this.deathsCount = deathsCount;
    }

    public String getMainCause() {
        return mainCause;
    }

    public void setMainCause(String mainCause) {
        this.mainCause = mainCause;
    }

    public int getAccidentCount() {
        return accidentCount;
    }

    public void setAccidentCount(int accidentCount) {
        this.accidentCount = accidentCount;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    @Override
    public String toString() {
        return "impl.BasicInfo{" +
                "name='" + name + '\'' +
                ", accidentCount=" + accidentCount +
                ", deathsCount=" + deathsCount +
                ", mainCause='" + mainCause + '\'' +
                ", cause='" + cause + '\'' +
                '}';
    }
}
