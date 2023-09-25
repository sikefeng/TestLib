package io.jitpack.api

object TestUtils {

    val imageList = listOf<Int>(R.mipmap.a1,R.mipmap.a2,R.mipmap.a3,R.mipmap.a4,R.mipmap.a5)

    @JvmStatic
    fun testPrint(){
        println("Hello World!")
        println(imageList.size.toString())
    }

}