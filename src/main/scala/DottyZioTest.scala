import zio.console.putStrLn
import zio._

object DottyZioTest extends App {
  override def run(args: List[String]) =
    for {
      _ <- putStrLn("Hello Dotty with Zio")
    } yield (0)
}
