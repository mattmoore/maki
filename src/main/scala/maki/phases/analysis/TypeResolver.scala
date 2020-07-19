package maki.phases.analysis

object TypeResolver {
  val IntPattern = "\\d+".r
  val StringPattern = """^".*"$""".r

  def inferType(expression: String) = expression match {
    case IntPattern() => "Int"
    case StringPattern() => "String"
  }
}
