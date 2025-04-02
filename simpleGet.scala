import scala.io.Source

def getExamplePage(): String = {
  Source.fromURL("https://character.totalpartykill.ca/basic/json/").mkString
}

// Usage
val content = getExamplePage()
println(content)
