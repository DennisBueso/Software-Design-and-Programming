package courseworks.sml

case class DivInstruction(label: String, opcode: String, result: Int, op1: Int, op2: Int)
  extends Instruction(label, opcode) {

  override def execute(m: Machine): Unit = {
    val value1 = m.regs(op1)
    val value2 = m.regs(op2)
    m.regs(result) = value1 / value2
  }

  override def toString: String = {
    super.toString + " register " + op1 + " / register " + op2 + " to register " + result + "\n"
  }
}

object DivInstruction {
  def apply(label: String, result: Int, op1: Int, op2: Int): DivInstruction =
    new DivInstruction(label, "div", result, op1, op2)
}
