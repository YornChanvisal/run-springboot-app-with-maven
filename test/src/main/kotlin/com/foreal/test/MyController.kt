package com.foreal.test

import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Date
import kotlin.time.TimeSource

@RestController
class MyController {
    @GetMapping("/")
    fun index(): String {
        return "Emm, hi i guess. but, this is my homepage!"
    }
    @GetMapping("/follow")
    fun follow(): String {
        return "Why are you following me here? TwT"
    }

//    fun main(args: Array<String>) {
//        val timeSource = TimeSource.Monotonic
//
//        val arrayMark1 = timeSource.markNow()
//        val array = arrayOf('1', '2')
//        array.set(0, '3');
//        array.set(0, '4');
//        array.set(0, '5');
//        array.set(0, '6');
//        array.set(0, '7');
//
//        val arrayMark2 = timeSource.markNow()
//        val arrayTimeExecution = arrayMark2 - arrayMark1
//        println("Array timing: $arrayTimeExecution")
//
//        val linkedListMark1 = timeSource.markNow()
//    }

}