import scala.io.Source

def getExamplePage(): String = {
  Source.fromURL("https://www.example.com").mkString
}

// Usage
val content = getExamplePage()
println(content)
