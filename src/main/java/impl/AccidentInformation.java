package impl;

public class AccidentInformation {
    private int year;
    private String month;
    private String alcohol;
    private String day;
    private int numberOfDeaths;
    private String mainCause;
    private String cause;

    public AccidentInformation(int year, String month, String alcohol, String day, int numberOfDeaths, String mainCause, String cause) {
        this.year = year;
        this.month = month;
        this.alcohol = alcohol;
        this.day = day;
        this.numberOfDeaths = numberOfDeaths;
        this.mainCause = mainCause;
        this.cause = cause;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getNumberOfDeaths() {
        return numberOfDeaths;
    }

    public void setNumberOfDeaths(int numberOfDeaths) {
        this.numberOfDeaths = numberOfDeaths;
    }

    public String getMainCause() {
        return mainCause;
    }

    public void setMainCause(String mainCause) {
        this.mainCause = mainCause;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    @Override
    public String toString() {
        return "impl.AccidentInformation{" +
                "year=" + year +
                ", month='" + month + '\'' +
                ", alcohol='" + alcohol + '\'' +
                ", day='" + day + '\'' +
                ", numberOfDeaths=" + numberOfDeaths +
                ", mainCause='" + mainCause + '\'' +
                ", cause='" + cause + '\'' +
                '}';
    }
}
