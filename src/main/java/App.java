import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("heros/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/hero-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/heros", (request, response) -> {
     Map<String, Object> model = new HashMap<String, Object>();
     model.put("heros", Hero.all());
     model.put("template", "templates/heros.vtl");
     return new ModelAndView(model, layout);
   }, new VelocityTemplateEngine());


    post("/heros", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      //params for heroes form
      String name = request.queryParams("name");
      int age = Integer.parseInt(request.queryParams("age"));
      String ability = request.queryParams("abilty");
      String weakness = request.queryParams("weakness");
      Hero newHero = new Hero(name, age, ability, weakness);
      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/heros/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Hero hero = Hero.find(Integer.parseInt(request.params(":id")));
      model.put("hero", hero);
      model.put("template", "templates/hero.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
