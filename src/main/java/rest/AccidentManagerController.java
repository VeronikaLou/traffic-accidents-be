package rest;

import impl.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@RequestMapping("/rest")
@RestController
public class AccidentManagerController {
    private AccidentManager accidentManager;

    @SuppressWarnings("unchecked")
    public AccidentManagerController(){
        JSONParser jsonP = new JSONParser();
        accidentManager = new AccidentManager();
        try(FileReader reader = new FileReader("data.geojson")){
            Object object = jsonP.parse(reader);
            JSONObject jsonObject = (JSONObject) object;
            JSONArray jsonArray =(JSONArray) jsonObject.get("features");
            jsonArray.forEach(one -> parseObj((JSONObject) one, accidentManager));
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }

//    @Autowired
//    public AccidentManagerController(AccidentManager accidentManager) {
//        this.accidentManager = accidentManager;
//    }

    private static void parseObj(JSONObject object, AccidentManager accidentManager){
        JSONObject jsonObject = (JSONObject) object.get("properties");
        Long accidentId = (Long) jsonObject.get("OBJECTID");
        Long accidentYear = (Long) jsonObject.get("rok");
        String accidentMonth = (String) jsonObject.get("mesic");
        String accidentDay = (String) jsonObject.get("den_v_tydnu");
        String accidentAlcohol = (String) jsonObject.get("alkohol");
        String accidentMainCause = (String) jsonObject.get("hl_pricina");
        String accidentCause = (String) jsonObject.get("pricina");
        Long accidentDeath = (Long) jsonObject.get("smrt");
        String accidentPartOfTheTown = (String) jsonObject.get("MC_nazev");
        Accident accident = new Accident(accidentId, accidentYear, accidentMonth, accidentDay, accidentAlcohol, accidentMainCause, accidentCause, accidentDeath, accidentPartOfTheTown);
        accidentManager.addNewAccident(accident);
    }
    @GetMapping("/basicinfo")
    public ArrayList<BasicInfo> getBasicInfo(){


        System.out.println(accidentManager.getAllBasicInfo());
        return accidentManager.getAllBasicInfo();
    }

    @GetMapping("/detailinfo")
    public DetailInfo getDetailInfo(@RequestParam(value = "index", defaultValue = "0") int index){
       return accidentManager.getDetailInfo(index);

    }

    @GetMapping("/localaccidents")
    public ArrayList<AccidentInformation> getAccidentInformation(@RequestParam(value = "index", defaultValue = "0") int index){
        return accidentManager.getAllAccidents(index);
    }

    @GetMapping("/test")
    public String Test(){
        return "test";
    }


    @GetMapping("/test2")
    @SuppressWarnings("unchecked")
    public int Test2(){
        JSONParser jsonP = new JSONParser();
        accidentManager = new AccidentManager();
        try(FileReader reader = new FileReader("data.geojson")){
            Object object = jsonP.parse(reader);
            JSONObject jsonObject = (JSONObject) object;
            JSONArray jsonArray =(JSONArray) jsonObject.get("features");
            jsonArray.forEach(one -> parseObj((JSONObject) one, accidentManager));
        } catch (ParseException | IOException e) {
            return 15;
        }
        return accidentManager.getAllAccidents().size();
    }

    @GetMapping("/test3")
    public String Test3(){
        return "test, ale úplně jinej :D";
    }


}
