package courseworks.sml

case class BnzInstruction(label1: String, opcode: String, register: Int, label2: String)
  extends Instruction(label1, opcode) {

  override def execute(m: Machine): Unit = {
    if (m.regs(register) != 0) {
      m.pc = m.labels.labels.indexOf(label2)
    }
  }

  override def toString: String = {
    super.toString + " if register " + register + " value is not 0, execute statement " + label2 + "\n"
  }
}

object BnzInstruction {
  def apply(label1: String, register: Int, label2: String): BnzInstruction =
    new BnzInstruction(label1, "bnz", register, label2)
}
