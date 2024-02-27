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
}
