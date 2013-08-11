class BankAccount_1 (initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = { balance += amount; balance }
  def withdraw(amount: Double) = { balance -= amount; balance }

  def check = balance
}

class CheckingAccount(initialBalance: Double) extends BankAccount_1(initialBalance) {
  override def deposit(amount: Double) = {
    super.deposit(amount - 1)
  }

  override def withdraw(amount: Double) = {
    super.withdraw(amount + 1)
  }
}

class SavingsAccount(initialBalance: Double) extends BankAccount_1(initialBalance) {
  var freeTxns = 3

  def earnMonthlyInterest() = {
    freeTxns = 3
    deposit(check*0.01)
    freeTxns = 3
  }

  override def deposit(amount: Double) = {
    var fee = 1
    if (freeTxns > 0) fee = 0
    freeTxns = freeTxns-1
    super.deposit(amount - fee)

  }

  override def withdraw(amount: Double) = {
    var fee = 1
    if (freeTxns > 0) fee = 0
    freeTxns = freeTxns-1
    super.withdraw(amount + fee)
  }
}


object Inheritance extends App {
  val ca = new CheckingAccount(100)
  printf("Checking balance: %s\n", ca.check)

  ca.deposit(10)
  printf("Checking balance: %s\n", ca.check)

  ca.withdraw(10)
  printf("Checking balance: %s\n", ca.check)

  val sa = new SavingsAccount(100)
  printf("Savings balance: %s\n", sa.check)

  sa.deposit(10)
  printf("Savings balance: %s\n", sa.check)

  sa.withdraw(10)
  printf("Savings balance: %s\n", sa.check)

  sa.withdraw(10)
  sa.withdraw(10)

  printf("Savings balance: %s\n", sa.check)

  sa.earnMonthlyInterest()

  printf("Savings balance: %s\n", sa.check)
}
