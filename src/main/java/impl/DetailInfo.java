package impl;

import java.util.HashMap;
import java.util.Map;

public class DetailInfo {
    private String name;
    private Map<String, Integer> mainCause = new HashMap<>();
    private Map<String, Integer> alcohol = new HashMap<>();
    private Map<String, Integer> day = new HashMap<>();
    private Map<Integer, Integer> year = new HashMap<>();
    private Map<String, Integer> month = new HashMap<>();

    public DetailInfo(String name, Map<String, Integer> mainCause, Map<String, Integer> alcohol, Map<String, Integer> day, Map<Integer, Integer> year, Map<String, Integer> month) {
        this.mainCause = mainCause;
        this.alcohol = alcohol;
        this.day = day;
        this.year = year;
        this.month = month;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getMainCause() {
        return mainCause;
    }

    public void setMainCause(Map<String, Integer> mainCause) {
        this.mainCause = mainCause;
    }

    public Map<String, Integer> getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Map<String, Integer> alcohol) {
        this.alcohol = alcohol;
    }

    public Map<String, Integer> getDay() {
        return day;
    }

    public void setDay(Map<String, Integer> day) {
        this.day = day;
    }

    public Map<Integer, Integer> getYear() {
        return year;
    }

    public void setYear(Map<Integer, Integer> year) {
        this.year = year;
    }

    public Map<String, Integer> getMonth() {
        return month;
    }

    public void setMonth(Map<String, Integer> month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "impl.DetailInfo{" +
                "name='" + name + '\'' +
                ", mainCause=" + mainCause +
                ", alcohol=" + alcohol +
                ", day=" + day +
                ", year=" + year +
                ", month=" + month +
                '}';
    }
}
