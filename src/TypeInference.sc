println("Welcome to Type Inference")
val num = 5
val decimal = 6.4433
var x = 1 + 2*3.4

List(1,true,"Hello")
def addOne(x:Double) = x+1.0
def validx(x:AnyVal) = if(x == 0) 1 else "Zero"

addOne(x)
validx(x)


var a = 10.to(20)
var e = 11.toChar
var f = 22.toByte
var g = 44.22.toInt

var s = 10
while(s != 0){
  println(s)
  s -= 1
}
println(s)
s = 10
do {
  println(s)
  s -= 1
}while(s != -1)

for(x <- 10 to 0 by -1) {
  println(x)
}

for (num <- 1 to 10) yield num +1

def abs(x:Int) = if(x<0) -x else x

def pname(left:String="[", fname:String, lname:String, right:String="]"): Unit ={
  println(left+" "+ fname +" "+ lname+" "+right)
}
pname(fname = "Sachin", lname = "Raja")
