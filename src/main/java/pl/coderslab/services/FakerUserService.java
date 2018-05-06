package pl.coderslab.services;

import com.github.javafaker.Faker;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;



@Service
public class FakerUserService {
    private ArrayList<JSONObject> users = new ArrayList<>();

//    @Scheduled(fixedRate = 5000)
    public void regenerate() throws JSONException {
        Faker faker = new Faker();
        users.clear();
        for (int i = 0; i < 10; i++) {
            JSONObject oJsonInner = new JSONObject();
            oJsonInner.put("name", faker.name().firstName());
            oJsonInner.put("surname", faker.name().lastName());
            oJsonInner.put("email", faker.internet().emailAddress());
            oJsonInner.put("password", faker.internet().password());
            users.add(oJsonInner);
        }
    }

    FakerUserService() throws JSONException{
        this.regenerate();
    }
    public ArrayList<JSONObject> getUsers() {
        return users;
    }
}