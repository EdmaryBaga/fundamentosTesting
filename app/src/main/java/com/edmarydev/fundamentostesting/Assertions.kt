package com.edmarydev.fundamentostesting

class Assertions {
    private val user = User("Alex", 2)

    fun getLuckyNumbers() : Array<Int>{
        return arrayOf(12,10);
    }


    fun getName() :String {
        return user.name
    }

    fun checkHuman(user : User):Boolean{
        return user.isHuman
    }

    fun checkHuman(user: User? = null):Boolean?{
        if(user == null) return  null
        return user.isHuman
    }

    fun isAdult(user: User):Boolean{
        if(!user.isHuman) return true
        return user.age >=18
    }



}