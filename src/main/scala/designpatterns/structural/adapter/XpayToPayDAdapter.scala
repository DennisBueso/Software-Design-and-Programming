package designpatterns.structural.adapter

class XpayToPayDAdapter extends PayD {
  private val xpayItem = new XpayImpl

  override def getCustCardNo: String = xpayItem.getCreditCardNo

  override def setCustCardNo(custCardNo: String): Unit = xpayItem.setCreditCardNo(custCardNo)

  override def getCardOwnerName: String = xpayItem.getCustomerName

  override def setCardOwnerName(cardOwnerName: String): Unit = xpayItem.setCustomerName(cardOwnerName)

  override def getCardExpMonthDate: String = xpayItem.getCardExpMonth

  override def setCardExpMonthDate(cardExpMonthDate: String): Unit = xpayItem.setCardExpMonth(cardExpMonthDate)

  override def getCVVNo: Integer = xpayItem.getCardCVVNo.toInt

  override def setCVVNo(cVVNo: Integer): Unit = xpayItem.setCardCVVNo(cVVNo.toShort)

  override def getTotalAmount: Double = xpayItem.getAmount

  override def setTotalAmount(totalAmount: Double): Unit = xpayItem.setAmount(totalAmount)
}
