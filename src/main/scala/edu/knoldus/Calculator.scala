package edu.knoldus

class Calculator {

  def add(a: Int, b: Int): Int = a + b

  def subtract(a: Int, b: Int): Int = a - b

  def multiply(a: Int, b: Int): Int = a * b

  def divide(a: Int, b: Int): Double = {
    require(b != 0)
    a / b.toDouble
  }

  def modulus(a: Int, b: Int): Int = {
    require(b != 0)
    if(a < 0 && b > 0) {
      val a1 = -a
      val q = a1 / b
      b - (a1 - (b * q))
    }
    else if(a > 0 && b < 0) {
      val b1 = -b
      val q1 = a / b1
      -(b1 - (a - (b1 * q1)))
    }
    else{
      val q2 = a / b
      a - (b * q2)
    }
  }

  def power(a: Int, b: Int): Double = {

    def powerRecursive(a: Int, b: Int, c: Int): Int = {
      if(b == 0) {
        c
      }
      else{
        powerRecursive(a, b-1, a*c)
      }
    }

    if(b < 0){
      1.0 / powerRecursive(a, -b, 1)
    }
    else {
      powerRecursive(a, b, 1)
    }
  }

  def absolute(a: Int): Int = {
    if(a < 0) {
      -a
    }
    else{
      a
    }
  }

  def maximum(a: Int, b: Int): Int = {
    if(a > b){
      a
    }
    else{
      b
    }
  }

  def minimum(a: Int, b: Int): Int = {
    if(a < b){
      a
    }
    else{
      b
    }
  }

}
