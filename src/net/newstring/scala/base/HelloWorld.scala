package net.newstring.scala.base

/**
  *
  * @author lic
  */
object HelloWorld {

  def main(args: Array[String]){
    println("测试 Hello World")
    System.out.println("By Java Hello World")

    val obj : PlainObject = new PlainObject
    println(obj.funcA())
  }

}
