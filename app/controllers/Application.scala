package controllers

import play.api._
import play.api.mvc._
import models._

import scala.util.{Failure, Success}

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def table(id: Int) = Action {
    val res = DataUser.findByUserId(id)
    res match {
      case Success(n) => Ok(views.html.index(n.name))
      case Failure(e) => Ok(views.html.index(e.toString))
    }
  }
}