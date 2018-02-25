package courseworks.sml

case class OutInstruction(label: String, opcode: String, register: Int) extends Instruction(label, opcode) {

  override def execute(m: Machine): Unit = println(m.regs(register))

  override def toString: String = super.toString + " register " + register
}

object OutInstruction {
  def apply(label: String, register: Int): OutInstruction = new OutInstruction(label, "out", register)
}
