package worksheet01

class Deque[T] {
  private val sentinel = Node(default, null, null)
  private var default: T = _
  sentinel.prev = sentinel
  sentinel.next = sentinel

  def push(value: T): Unit = {
    val node = Node(value, sentinel, sentinel.next)
    sentinel.next.prev = node
    sentinel.next = node
  }

  def pop(): T = {
    val element = sentinel.next.value
    sentinel.next.prev = sentinel
    sentinel.next = sentinel.next.next
    element
  }

  def shift(): Unit = {}

  def unshift(): Unit = {}

  private case class Node(value: T, var prev: Node, var next: Node)

}
