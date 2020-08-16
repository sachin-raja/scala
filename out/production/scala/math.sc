def square(x: Int) = x * x
def add(x: Int, y: Int) = x+y
def sub(a: Int, b: Int) = if (a < b) (b-a) else (a-b)
def div(a: Int, b: Int) = if ((a != 0) && (b != 0)) ( if(a>b) a/b else b/a ) else 0

square(2)
add(1,2)
sub(2,1)
div(1,2)

square(3)
add(2,4)
sub(1,2)
div(0,0)

square(4)
add(4,1)
sub(-2,1)
div(1,0)


def maxAge {
  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")
}
maxAge