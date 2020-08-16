var double = (i:Int) => i*2
def highOrder(x:Int, y:Int=>Int) = y(x)

highOrder(6, double)

def hello = (name: String) => {"Hello "+ name}

var message = hello("SachinRaja")

//operators: +,-,*,/,%
//Relational operators: ==, !=, >, <, <=, >=
//Logical operators: &&, ||, !
//bitwise &, |, ^, ~(complement), << (left shift), >> (Right shift)

//NO ++, -- operators in scala
// +=, -=, *=, %=, /=
// scala math abs, min, sqrt

//Cons operator ::
//    to create a list 1::2::3::Nil
// Nil end of list


var today = "1"
if(today == "sunday") println(s"today is $today")
else println(s"today is not -$today")