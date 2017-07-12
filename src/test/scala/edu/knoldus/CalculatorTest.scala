package edu.knoldus

import org.scalatest.FunSuite

class CalculatorTest extends FunSuite {

  test("check add method"){
    assert(new Calculator().add(1,2) == 3)
  }

  test("check subtract method"){
    assert(new Calculator().subtract(1,2) == -1)
  }

  test("check multiply method"){
    assert(new Calculator().multiply(3,2) == 6)
  }

  test("check divide method"){
    assert(new Calculator().divide(1,1) == 1)
  }

  test("check divide method with divisor = 0") {
    intercept[IllegalArgumentException] {
      new Calculator().divide(1, 0)
    }
  }

  test("check divide method with divisor > dividend") {
    assert(new Calculator().divide(1,2) == 0.5)
  }

  test("check modulus method"){
    assert(new Calculator().modulus(1,1) == 0)
  }

  test("check modulus method with divisor = 0") {
    intercept[IllegalArgumentException] {
      new Calculator().modulus(1, 0)
    }
  }

  test("check modulus method with  negative divisor") {
      assert(new Calculator().modulus(3, -2) == -1)
  }

  test("check modulus method with  negative dividend") {
    assert(new Calculator().modulus(-3, 2) == 1)
  }

  test("check modulus method with  negative divisor & dividend") {
    assert(new Calculator().modulus(-3, -2) == -1)
  }

  test("check power method"){
    assert(new Calculator().power(2,0) == 1)
  }

  test("check power method again"){
    assert(new Calculator().power(2,3) == 8)
  }

  test("check power method with negative power") {
    assert(new Calculator().power(2,-1) == 0.5)
  }

  test("check absolute method"){
    assert(new Calculator().absolute(3) == 3)
  }

  test("check absolute method with negative number"){
    assert(new Calculator().absolute(-1) == 1)
  }

  test("check maximum method"){
    assert(new Calculator().maximum(1,2) == 2)
  }

  test("check maximum method again"){
    assert(new Calculator().maximum(2,1) == 2)
  }

  test("check minimum method"){
    assert(new Calculator().minimum(1,2) == 1)
  }

  test("check minimum method again"){
    assert(new Calculator().minimum(2,1) == 1)
  }

}
