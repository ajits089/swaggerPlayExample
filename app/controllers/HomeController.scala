package controllers

import models.Person

import javax.inject._
import play.api.mvc._
import play.api.libs.json.Json

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    //Can this be improved?
    Redirect("http://localhost:9000/docs/swagger-ui/index.html?url=http://localhost:9000/swagger.json#/")
  }

  /**
   *
   * @param name
   * @return name with lucky number
   */

  def getNameInJson(name: String) = Action {
    val person = Person(name, name.length * 5 / 2)
    Ok(Json.toJson(person))
  }
}
