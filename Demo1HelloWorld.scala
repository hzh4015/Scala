package com.hzh.scala

object Demo1HelloWorld {
  /**
   * object可以理解为一个单例对象，相当于Java中给方法增加静态关键字
   *
   * main函数需要object中才能直接运行
   * def : scala中定义方法的关键字
   * main  ： 方法名
   * args: Array[String]: 参数类型
   * [String]：泛型
   * Unit ：相当于Java中的void
   */
  def main(args: Array[String]): Unit = {
    println("helloWorld")
    //可以使用Java的方法，java和scala兼容都是编译成class文件，比Java简洁，在Java做了一层封装
    System.out.println("helloWorld")
  }
}
