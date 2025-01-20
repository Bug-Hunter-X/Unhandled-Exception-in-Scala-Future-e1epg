```scala
import scala.concurrent.{ExecutionContext, Future}

class MyClass(implicit ec: ExecutionContext) {
  def myMethod(x: Int): Future[Int] = Future {
    if (x == 0) throw new Exception("Zero is not allowed")
    x * 2
  }
}
```