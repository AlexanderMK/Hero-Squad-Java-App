import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

import java.util.ArrayList;


public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("heros", request.session().attribute("heros"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/heros", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<Hero> heros = request.session().attribute("heros");
      if (heros == null) {
      heros = new ArrayList<Hero>();
      request.session().attribute("heros", heros);
      }

      //params for heroes form
      String name = request.queryParams("name");
      int age = Integer.parseInt(request.queryParams("age"));
      String ability = request.queryParams("abilty");
      Hero newHero = new Hero(name, age, ability);
      heros.add(newHero);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());



  }
}
