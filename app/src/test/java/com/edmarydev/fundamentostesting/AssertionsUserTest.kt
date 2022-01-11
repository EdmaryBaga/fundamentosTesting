package com.edmarydev.fundamentostesting

import org.junit.*
import org.junit.Assert.*

class AssertionsUserTest {

    /*Con esta prueba se busca reutilizar codigo*/

    private lateinit var bot :User
    private lateinit var assertion : Assertions

    /*
    * @BeforeClass y @AfterClass se ejecutan una sola vez al iniciar el test
    * */
    companion object{
        private  lateinit var Ana: User

        //@JvmStatic nos permite acceder al metodo de test pues lo vuelve static

        @BeforeClass
        @JvmStatic
        fun setUpCommon(){
            Ana =  User("Ana", 23, true)
            println("@BeforeClass")
        }

        @AfterClass @JvmStatic
        fun tearDownCommon(){
            Ana = User("",0)
            println("@AfterClass")
        }
    }

    /*
    * @Before y @After se ejecutan al iniciar cada test
    * */

    @Before
    fun setUp(){
        bot = User("Android", 34, false )
        assertion = Assertions()
        println("@Before")

    }

    @After
    fun setUpAfter(){
        bot = User("",0)
        println("@After")
    }


    @Test
    fun isHumanTest(){
        assertTrue("Test to is human", Ana.isHuman)
    }

    @Test
    fun checkNotNullUserTest(){
        assertNotNull(assertion.isHuman(Ana))
    }

    @Test
    fun checkTheSameTest(){
        val copyAna = Ana
        assertSame(Ana, copyAna)
    }

    @Test
    fun checkNotTheSameTest(){
        assertNotSame(Ana, assertion)
    }

}