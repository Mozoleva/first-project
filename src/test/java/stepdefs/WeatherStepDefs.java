package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;

import java.util.Map;

public class WeatherStepDefs {
    @Given("city id: {long}")
    public void set_city_id(long cityId) {

    }

    @When("we are requesting weather data")
    public void request_weather() {

    }

    @Then("coords are:")
    public void check_coord(Map<String, Double> params) {
        params.get("lon"); // -> 145.77
    }

    @Then("weather is:")
    public void check_weather(Map<String, String> params) {
        Long.parseLong(params.get("id"));
        Double.parseDouble(params.get("id"));
        Integer.parseInt(params.get("id"));
    }

    @Then("base is {string}")
    public void check_base(String base) {

    }

    //TODO: Homework: add all other step definition
}
