package com.edmarydev.fundamentostesting

import org.junit.*
import org.junit.Assert.assertEquals
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)  //llamamos a la clase de Junit para la paremetrizacion
class ParameterizedTest(var currentValue: Boolean, var currentUser: User) {

    //se llama al rule
    @get:Rule
    val locationESRule = LocationESRule()

    companion object{

        var assertions:Assertions? = null

        @BeforeClass @JvmStatic
        fun setUpCommon(){
            assertions = Assertions()
        }

        @AfterClass @JvmStatic
        fun tearDownCommon(){
            assertions = null
        }

        /*Arreglo sin la regla
        @Parameterized.Parameters @JvmStatic
        fun getUsersUS() = arrayOf(
            arrayOf(false, User(name = "Valeria", age = 12)),
            arrayOf(true, User("Clara", 34)),
            arrayOf(true, User("Bot01", 4, false))
        )*/

        //Array para españa
        @Parameterized.Parameters @JvmStatic
        fun getUsersES() = arrayOf(
            arrayOf(false, User(name = "Valeria", age = 19)),
            arrayOf(false, User("Clara", 14)),
            arrayOf(true, User("Bot01", 4, false))
        )
    }

    @Test
    fun isAdultTest() {
        /* assertTrue(assertion.isAdult(bot))
         assertion.setLocation("USA")
         assertFalse(assertion.isAdult(lena))*/

       //assertEquals(currentValue, assertions?.isAdult(currentUser))
        //Prueba con rules
        assertEquals(currentValue, assertions?.isAdult(currentUser))
    }
}