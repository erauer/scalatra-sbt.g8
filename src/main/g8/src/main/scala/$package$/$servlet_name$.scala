package $package$

import org.scalatra._
import scalate.ScalateSupport

class $servlet_name$ extends $name;format="Camel"$Stack {

  get("/") {
    contentType = "text/html"

    ssp("/index")
 }

}
