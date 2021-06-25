package impl;

public class Accident {
    private Long id;
    private Long year;
    private String month;
    private String dayOfTheWeek;
    private String alcohol;
    private String mainCause;
    private String cause;
    private Long death;
    private String partOfTheTown;

    public Accident(Long id, Long year, String month, String dayOfTheWeek, String alcohol, String mainCause, String cause, Long death, String partOfTheTown) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.dayOfTheWeek = dayOfTheWeek;
        this.alcohol = alcohol;
        this.mainCause = mainCause;
        this.cause = cause;
        this.death = death;
        this.partOfTheTown = partOfTheTown;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
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

    public Long getDeath() {
        return death;
    }

    public void setDeath(Long death) {
        this.death = death;
    }

    public String getPartOfTheTown() {
        return partOfTheTown;
    }

    public void setPartOfTheTown(String partOfTheTown) {
        this.partOfTheTown = partOfTheTown;
    }

    @Override
    public String toString() {
        return "impl.Accident{" +
                "id=" + id +
                ", year=" + year +
                ", month='" + month + '\'' +
                ", dayOfTheWeek='" + dayOfTheWeek + '\'' +
                ", alcohol='" + alcohol + '\'' +
                ", mainCause='" + mainCause + '\'' +
                ", cause='" + cause + '\'' +
                ", death=" + death +
                ", partOfTheTown='" + partOfTheTown + '\'' +
                '}';
    }
}
