package designpatterns.structural.facade

case class ScheduleServerImpl() extends ScheduleServer {
  override def startBooting(): Unit = println("Starting Boot")

  override def readSystemConfigFile(): Unit = println("Reading System Config File")

  override def init(): Unit = println("Initialising")

  override def initializeContext(): Unit = println("Initialising Context")

  override def initializeListeners(): Unit = println("Initialising Listeners")

  override def createSystemObjects(): Unit = println("Creating System Objects")

  override def releaseProcesses(): Unit = println("Releasing Processes")

  override def destroy(): Unit = println("Destroying")

  override def destroySystemObjects(): Unit = println("Destroying System Objects")

  override def destroyListeners(): Unit = println("Destroying Listeners")

  override def destroyContext(): Unit = println("Destroying Context")

  override def shutdown(): Unit = println("Shutting Down")
}
