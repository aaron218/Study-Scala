package net.newstring.scala.base

/**
  * Scala的基本数据类型
  *
  * @author lic
  */
class PlainObject {
  val int: Int = 12
  val lon: Long = 12
  val dou: Double = 12
  val byt:Byte = 3
  val boo:Boolean = true

  def funcA(): String ={
    "123334".reverse
  }

  override def toString = s"PlainObject(int=$int, lon=$lon, dou=$dou, byt=$byt, boo=$boo)"
}
