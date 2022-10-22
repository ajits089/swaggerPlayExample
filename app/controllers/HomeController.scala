package controllers

import io.swagger.annotations.{Api, ApiOperation, ApiParam}
import models.Person

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json.Json

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Api(
  value = "SwaggerTestAPI",
  consumes = "application/json",
  produces = "application/json",
  protocols = "http")
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
    //Ok(views.html.index())
    Ok(Json.toJson(""))
  }

  /**
   *
   * @param name
   * @return name with default age
   */
  @ApiOperation(nickname = "getNameInJson", value = "getNameInJson", notes = "getNameInJson", httpMethod = "GET")
  def getNameInJson(@ApiParam(value = "name", required = true) name: String) = Action {
    val person = Person(name, name.length * 5 / 2)
    Ok(Json.toJson(person))
  }
}
