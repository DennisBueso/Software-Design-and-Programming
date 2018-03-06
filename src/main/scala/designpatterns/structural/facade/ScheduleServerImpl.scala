package designpatterns.structural.facade

//TODO

case class ScheduleServerImpl() extends ScheduleServer {
  override def startBooting(): Unit = ???

  override def readSystemConfigFile(): Unit = ???

  override def init(): Unit = ???

  override def initializeContext(): Unit = ???

  override def initializeListeners(): Unit = ???

  override def createSystemObjects(): Unit = ???

  override def releaseProcesses(): Unit = ???

  override def destroy(): Unit = ???

  override def destroySystemObjects(): Unit = ???

  override def destroyListeners(): Unit = ???

  override def destroyContext(): Unit = ???

  override def shutdown(): Unit = ???
}
