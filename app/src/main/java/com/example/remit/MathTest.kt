package com.example.remit

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

     var math:Math?=null

    @Before
    fun init(){
        math = Math()
    }

    @Test
    fun simpleAdd(){
        assertEquals("12",math?.add("5","7"))
    }

    @Test
    fun symbolAdd(){
        assertEquals("нельзя вводить буквы",math?.add("5","7dsakj"))
    }
    @Test
    fun doubleAdd(){
        assertEquals("12.0",math?.add("5.0","7"))
    }

    @Test
    fun simpleDivide(){
        assertEquals("6",math?.divide("12","2"))
    }

    @Test
    fun zeroDivide(){
        assertEquals("На ноль делить нельзя",math?.divide("12","0"))
    }

    @Test
    fun emptyAdd(){
        assertEquals("вы не заполнили поле",math?.divide("12",""))
    }

    @Test
    fun negativeAdd(){
        assertEquals("13",math?.add("-5","-7"))
    }

    @After
   fun detach(){
       math = null
   }
}