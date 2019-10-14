package com.namget.algorism

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Before
    fun test(){
    }

    open class b {

    }

    class a : b(){

    }

    @Test
    fun addition_isCorrect() {
        val a : a = a()
        val b : b = b()
        val c : b = a()
        a is b
        if(b is a){
            print("aa")
        }
        if(c is a){
            print("bb")
            print(c.typ)
        }



    }
}
