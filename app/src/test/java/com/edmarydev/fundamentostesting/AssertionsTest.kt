package com.edmarydev.fundamentostesting

import org.junit.Assert.*
import org.junit.Test
import kotlin.random.Random

class AssertionsTest{
    @Test
    fun getArrayTest(){
        val assertion = Assertions()
        val array = arrayOf(12,10)

        assertArrayEquals("Mensaje de error personalizado", array, assertion.getLuckyNumbers())
    }

    @Test
    fun getNameTest(){
        val assertion = Assertions()
        val ana = User(name = "Ana", age = 29)
        val alex = User(name = "Alex" , age = 2)

        assertEquals("Are the same Name?", alex.name, assertion.getName())
        assertNotEquals("Are diferent name? ", alex.name, ana.name)
    }

    @Test
    fun isHumanWithBotTest(){
        val bot = User(name = "Botcito", age = 2, isHuman = false)

        assertFalse(bot.isHuman)
    }

    @Test
    fun checkNullUSerIsHumanTest(){
        val user = null
        val assertion = Assertions()

        assertNull(assertion.checkHuman(user))
    }

    @Test
    fun checkNotNullUserTest(){
        val user : User = User(name = "paco", age = 23)
        val assertion = Assertions()

        assertNotNull(assertion.checkHuman(user))
    }

    @Test
    fun CheckTheSameTest(){
        val lena : User = User(name = "Lena", age = 23)
        val bot = User(name = "Lena", age = 2, isHuman = false)
        val copyLena = lena
        //verifica que utilicen el mismo espació de memoria, que sea exactamente lo mismo

        assertSame(lena, copyLena)
        //assertSame(lana, bot) //falla

    }

    @Test
    fun checkNotTheSameTest(){
        val lena : User = User(name = "Lena", age = 23)
        val assertion = Assertions()

        assertNotSame(lena.name,assertion.getName())
    }


    @Test(timeout = 1000)
    fun checkTimeOut(){

        //deja de tronar cuando se obtiene un random > 1000
        val cities = arrayOf("Mexico", "Colombia", "Argentina")
        Thread.sleep(Random.nextLong(950, 1100))

        assertEquals(3,cities.size)
    }


}