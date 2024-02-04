package com.rockthejvm

object MyTestObject extends App {

  class MyTemplateClass {
    val thisColor: Int = 256
    def start() :Unit = println("Starting")

    def PrintOutInput(thisValue: String) :Unit = println("The input value is  : " + thisValue)
    def PrintOutInput(thisValue: Int) :Unit = println("The input value is  : " + thisValue.toString)
    def PrintOutInput() :Unit = println("just print a line like this from the super class")

  }



  val anInstance = new MyTemplateClass

  class MyTemplateClass_v2(val bgColor: Int) extends MyTemplateClass {
    override def PrintOutInput() :Unit = println("just print a line like this")
  }

  val anInstance_v2 = new MyTemplateClass_v2(200)

  println("Current background color : " + anInstance_v2.bgColor.toString)
  anInstance_v2.PrintOutInput("ThisInput")
  anInstance_v2.PrintOutInput(9999)
  anInstance_v2.PrintOutInput()
  anInstance_v2 PrintOutInput 9999

  class Person(name: String) {
    def apply(age: Int): Unit = println(s"My age is $age")
    def apply(name : String): Unit = println(s"My name is " + name)
    def incremented(x: Int): Int = return x + 1
  }

  val Rene = new Person("....")

  Rene apply 55
  Rene apply "Rene"
  Rene(55)
  Rene("Rene")
  println(Rene.incremented(Rene.incremented(Rene.incremented(Rene.incremented(100)))))


  val doubler: Function1[Int, Int] = (x: Int) => 2 * x
  println(doubler(4).toString)

  val aMappedList: List[Int] = List(1,2,3).map(x => x + 1)
  val aFlatMappedList:List[Int] = List(1,2,3).flatMap(x => List(x,2*x).filter(x => x < 4))
  println(aFlatMappedList)

  val simpleMultiplyer = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 - v2
  }

  println(simpleMultiplyer(2, 3).toString)
}

