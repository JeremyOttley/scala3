//libraryDependencies += "com.softwaremill.sttp.client4" %% "core" % "4.0.0-RC1"
import sttp.client4.quick._

def getExamplePage(): String = {
  val response = quickRequest
    .get(uri"https://www.example.com")
    .send()
  
  response.body
}

// Usage
val content = getExamplePage()
println(content)
