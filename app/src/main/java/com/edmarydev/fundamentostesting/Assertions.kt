package com.edmarydev.fundamentostesting

class Assertions {
    private val user = User("Alex", 26)

    fun getLuckyNumbers() : Array<Int>{
        return arrayOf(12,10);
    }


    fun getName() :String {
        return user.name
    }

    fun isHuman(user : User):Boolean{
        return user.isHuman
    }

    fun isHuman(user: User? = null):Boolean?{
        if(user == null) return  null
        return user.isHuman
    }

    fun isAdult(user: User):Boolean{
        if(!user.isHuman) return true
        return if (user.location =="USA") user.age>=21
        else user.age >=18
    }

    fun setLocation(location : String){
        user.location = location
    }



}