package com.bombadu.testingonandroid.homework


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {
     //Fibonacci Tests
    @Test
    fun `Check when 11 is entered result is 89`(){
        val num = 11
         val result = Homework.fib(num)
         assertThat(result).isEqualTo(89)
    }
    @Test
    fun `Check when 1 is entered result is 1`(){
        val num = 1
        val result = Homework.fib(num)
        assertThat(result).isEqualTo(1)
    }
    @Test
    fun `Check when 0 is entered result is 0`(){
        val num = 0
        val result = Homework.fib(num)
        assertThat(result).isEqualTo(0)
    }
    @Test
    fun `Check when 3 is entered result is 2`(){
        val num = 3
        val result = Homework.fib(num)
        assertThat(result).isEqualTo(2)

    }

    //Braces Tests

    @Test
    fun `Check braces 2 open 2 close returns true`(){
        val code = "(())"
        val result = Homework.checkBraces(code)
        assertThat(result).isTrue()
    }

    @Test
    fun `Check braces 3 open 2 close returns false`(){
        val code = "((())"
        val result = Homework.checkBraces(code)
        assertThat(result).isFalse()
    }

    @Test
    fun `Check braces 1 open 2 close returns false`(){
        val code = "())"
        val result = Homework.checkBraces(code)
        assertThat(result).isFalse()
    }

}