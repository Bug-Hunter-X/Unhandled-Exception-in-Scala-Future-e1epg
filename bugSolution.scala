```scala
import scala.concurrent.{ExecutionContext, Future}

class MyClass(implicit ec: ExecutionContext) {
  def myMethod(x: Int): Future[Int] = Future {
    if (x == 0) throw new Exception("Zero is not allowed")
    x * 2
  }.recover { 
    case e: Exception => 0 // Or handle the exception in a more sophisticated way
  }

  //Alternative using recoverWith for more complex recovery logic
  def myMethod2(x: Int): Future[Int] = Future {
    if (x == 0) throw new Exception("Zero is not allowed")
    x * 2
  }.recoverWith { 
    case e: Exception => Future.successful(0) //Or return a different Future
  }
}
```