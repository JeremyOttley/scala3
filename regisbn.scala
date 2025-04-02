val hyphen = "-".r
val isbn13 = "978-1-4780-6060-4"
val res = hyphen.replaceAllIn(isbn13, "")  // xxx Main Street
println(res)
