# Unhandled Exception in Scala Future

This repository demonstrates a common Scala error: unhandled exceptions within a `Future`.  The `bug.scala` file shows code that throws an exception if the input to `myMethod` is 0.  The `bugSolution.scala` file demonstrates a proper solution using `recover` or `recoverWith` to handle the potential exception.