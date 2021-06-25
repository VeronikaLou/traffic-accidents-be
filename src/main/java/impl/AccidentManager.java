package impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AccidentManager {
    private ArrayList<Accident> allAccidents = new ArrayList<>();

    public void addNewAccident(Accident accident){
        this.allAccidents.add(accident);
    }

    public Accident getAccident(int index){
        return this.allAccidents.get(index);
    }

    public ArrayList<Accident> getAllAccidents(){
        return this.allAccidents;
    }

    public ArrayList<String> getTownNames(){
        ArrayList<String> names = new ArrayList<>();
        for(Accident ac : this.allAccidents){
            if(!names.contains(ac.getPartOfTheTown())){
                names.add(ac.getPartOfTheTown());
            }
        }
        return names;
    }

    public ArrayList<String> getMainCauses(){
        ArrayList<String> mainCause = new ArrayList<>();
        for(Accident ac : this.allAccidents){
            if(!mainCause.contains(ac.getMainCause())){
                mainCause.add(ac.getMainCause());
            }
        }
        return mainCause;
    }

    public ArrayList<String> getCauses(){
        ArrayList<String> cause = new ArrayList<>();
        for(Accident ac : this.allAccidents){
            if(!cause.contains(ac.getCause())){
                cause.add(ac.getCause());
            }
        }
        return cause;
    }

    public ArrayList<Integer> getYears(){
        ArrayList<Integer> year = new ArrayList<>();
        for(Accident ac : this.allAccidents){
            if(!year.contains(ac.getYear().intValue())){
                year.add(ac.getYear().intValue());
            }
        }
        Collections.sort(year);
        return year;
    }

    public ArrayList<String> getAlcohols(){
        ArrayList<String> alcohol = new ArrayList<>();
        for(Accident ac : this.allAccidents){
            if(!alcohol.contains(ac.getAlcohol())){
                alcohol.add(ac.getAlcohol());
            }
        }
        Collections.sort(alcohol);
        return alcohol;
    }

    public ArrayList<String> getDays(){
        ArrayList<String> day = new ArrayList<>();
        day.add("pondělí");
        day.add("úterý");
        day.add("středa");
        day.add("čtvrtek");
        day.add("pátek");
        day.add("sobota");
        day.add("neděle");
        return day;
    }

    public ArrayList<BasicInfo> getAllBasicInfo(){
        ArrayList<BasicInfo> basicInfos = new ArrayList<>();
        ArrayList<String> names = getTownNames();
        ArrayList<String> mainCausesValues = getMainCauses();
        ArrayList<String> causesValues = getCauses();
        for(String name : names){
            int deathsCount = 0;
            int accidentCount = 0;
            ArrayList<Integer> mainCausesCount = new ArrayList<Integer>(Collections.nCopies(mainCausesValues.size(), 0));
            ArrayList<Integer> causesCount = new ArrayList<Integer>(Collections.nCopies(causesValues.size(), 0));
            for(Accident ac : this.allAccidents){
                if(ac.getPartOfTheTown().equals(name)){
                    deathsCount+=ac.getDeath();
                    accidentCount+=1;
                    int index1 = mainCausesValues.indexOf(ac.getMainCause());
                    mainCausesCount.set(index1, mainCausesCount.get(index1)+1);
                    int index2 = causesValues.indexOf(ac.getCause());
                    causesCount.set(index2, causesCount.get(index2)+1);
                }
            }
            int mainCauseIndex = 0;
            for(int i = 0; i < mainCausesCount.size(); i++){
                if(mainCauseIndex < mainCausesCount.get(i)){
                    mainCauseIndex = i;
                }
            }
            int causeIndex = 0;
            for(int j = 0; j < causesCount.size(); j++){
                if(causeIndex < causesCount.get(j)){
                    causeIndex = j;
                }
            }
            BasicInfo basicInfo = new BasicInfo(name,deathsCount,mainCausesValues.get(mainCauseIndex), causesValues.get(causeIndex), accidentCount);
            basicInfos.add(basicInfo);
        }
        return basicInfos;
    }

    public DetailInfo getDetailInfo(int index){
        ArrayList<String> names = getTownNames();
        Map<String, Integer> mainCause = new HashMap<>();
        Map<String, Integer> alcohol = new HashMap<>();
        Map<String, Integer> day = new HashMap<>();
        Map<Integer, Integer> year = new HashMap<>();
        Map<String, Integer> month = new HashMap<>();
        for(Accident ac : this.allAccidents){
            if(ac.getPartOfTheTown().equals(names.get(index))){
                if(mainCause.containsKey(ac.getMainCause())){
                    mainCause.replace(ac.getMainCause(), mainCause.get(ac.getMainCause()) + 1);
                }
                else{
                    mainCause.put(ac.getMainCause(), 1);
                }
                if(alcohol.containsKey(ac.getAlcohol())){
                    alcohol.replace(ac.getAlcohol(), alcohol.get(ac.getAlcohol()) + 1);
                }
                else{
                    alcohol.put(ac.getAlcohol(), 1);
                }
                if(day.containsKey(ac.getDayOfTheWeek())){
                    day.replace(ac.getDayOfTheWeek(), day.get(ac.getDayOfTheWeek()) + 1);
                }
                else{
                    day.put(ac.getDayOfTheWeek(), 1);
                }
                if(year.containsKey(ac.getYear().intValue())){
                    year.replace(ac.getYear().intValue(), year.get(ac.getYear().intValue()) + 1);
                }
                else{
                    year.put(ac.getYear().intValue(), 1);
                }
                if(month.containsKey(ac.getMonth())){
                    month.replace(ac.getMonth(), month.get(ac.getMonth()) + 1);
                }
                else{
                    month.put(ac.getMonth(), 1);
                }
            }
        }
        DetailInfo detailInfo = new DetailInfo(names.get(index), mainCause, alcohol, day, year, month);
        return detailInfo;
    }

    public ArrayList<DetailInfo> getAllDetailInfo(){
        ArrayList<DetailInfo> detailInfos = new ArrayList<>();
        for(int i = 0; i < getTownNames().size(); i++){
            DetailInfo detailInfo = getDetailInfo(i);
            detailInfos.add(detailInfo);
        }
        return detailInfos;
    }

    public ArrayList<AccidentInformation> getAllAccidents(int index){
        ArrayList<AccidentInformation> accidentInformations = new ArrayList<>();
        String part_of_the_town = getTownNames().get(index);
        for(Accident accident : allAccidents){
            if(accident.getPartOfTheTown().equals(part_of_the_town)){
                AccidentInformation accidentInformation = new AccidentInformation(accident.getYear().intValue(), accident.getMonth(), accident.getAlcohol(), accident.getDayOfTheWeek(), accident.getDeath().intValue(), accident.getMainCause(), accident.getCause());
                accidentInformations.add(accidentInformation);
            }
        }
        return accidentInformations;
    }
}
