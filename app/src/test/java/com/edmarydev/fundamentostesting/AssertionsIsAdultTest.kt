package com.edmarydev.fundamentostesting

import org.junit.After
import org.junit.*
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class AssertionsIsAdultTest {

    private lateinit var bot :User
    private lateinit var assertion : Assertions
    private lateinit var lena : User

    //se llama al rule
    @get:Rule val locationESRule = LocationESRule()

    @Before
    fun setUp(){
        bot = User("Android", 34, false )
        lena =  User(name = "Lena", age = 24)
        assertion = Assertions()
    }

    @After
    fun tearDown(){
        bot = User()
        lena = User()
    }

    @Test
    fun isAdultTest() {
       /* assertTrue(assertion.isAdult(bot))
        assertion.setLocation("USA")
        assertFalse(assertion.isAdult(lena))*/

        assertEquals(true, locationESRule.assertions?.isAdult(lena))
        assertEquals(true, locationESRule.assertions?.isAdult(bot))

    }
}