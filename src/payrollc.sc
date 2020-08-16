//var hours = 45
def getOverTime(hours:Int):Int = hours-40

getOverTime(45)

def payroll(salaried:Boolean, payRate:Double, hours:Int) = {
  //check if they are salaried then print their salary
  if(!salaried){
    //calculate the overtime and overtime is 1.5* payRate
    var overTimePay:Double =0
    var overTime:Int = 0
    if(hours>40){
      overTimePay = getOverTime(hours)*(payRate*1.5)
      overTime = hours-40
    }
    //calculate the normal pay
    var normalPay = (hours - overTime)*payRate

    //return the result
    overTimePay+normalPay
  }
  else println("Employee Salary is 800$")
}

payroll(salaried = false,10.5,40)
payroll(salaried = true,10.5,45)
payroll(salaried = false,15.5,33)
payroll(salaried = false,9.5,48)
payroll(salaried = false,10.5,20)
payroll(salaried = false,10.5,50)