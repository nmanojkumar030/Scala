package coursera.week3

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(87); 
  println("Welcome to the Scala worksheet");$skip(37); 
  val rational1 = new Rational(1, 2);System.out.println("""rational1  : coursera.week3.Rational = """ + $show(rational1 ));$skip(18); val res$0 = 
  rational1.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(18); val res$1 = 
  rational1.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(39); 

  val rational2 = new Rational(2, 3);System.out.println("""rational2  : coursera.week3.Rational = """ + $show(rational2 ));$skip(27); val res$2 = 
  rational1.add(rational2);System.out.println("""res2: coursera.week3.Rational = """ + $show(res$2));$skip(31); 

  val x = new Rational(1, 3);System.out.println("""x  : coursera.week3.Rational = """ + $show(x ));$skip(29); 
  val y = new Rational(5, 7);System.out.println("""y  : coursera.week3.Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : coursera.week3.Rational = """ + $show(z ));$skip(45); val res$3 = 

  // Impelementing x-y-z
  x.sub(y).sub(z);System.out.println("""res3: coursera.week3.Rational = """ + $show(res$3));$skip(11); val res$4 = 
  y.add(y);System.out.println("""res4: coursera.week3.Rational = """ + $show(res$4));$skip(11); val res$5 = 
  x.max(y);System.out.println("""res5: coursera.week3.Rational = """ + $show(res$5));$skip(101); 

  //val strange = new Rational(1, 0)
  //strange.add(strange)

  val rational3 = new Rational(2);;System.out.println("""rational3  : coursera.week3.Rational = """ + $show(rational3 ))}

}
