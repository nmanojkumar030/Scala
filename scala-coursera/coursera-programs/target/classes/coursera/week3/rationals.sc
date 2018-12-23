package coursera.week3

object rationals {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val rational1 = new Rational(1, 2)              //> rational1  : coursera.week3.Rational = 1/2
  rational1.numer                                 //> res0: Int = 1
  rational1.denom                                 //> res1: Int = 2

  val rational2 = new Rational(2, 3)              //> rational2  : coursera.week3.Rational = 2/3
  rational1.add(rational2)                        //> res2: coursera.week3.Rational = 7/6

  val x = new Rational(1, 3)                      //> x  : coursera.week3.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : coursera.week3.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : coursera.week3.Rational = 3/2

  // Impelementing x-y-z
  x.sub(y).sub(z)                                 //> res3: coursera.week3.Rational = -79/42
  y.add(y)                                        //> res4: coursera.week3.Rational = 10/7
  x.max(y)                                        //> res5: coursera.week3.Rational = 5/7

  //val strange = new Rational(1, 0)
  //strange.add(strange)

  val rational3 = new Rational(2);                //> rational3  : coursera.week3.Rational = 2/1

}