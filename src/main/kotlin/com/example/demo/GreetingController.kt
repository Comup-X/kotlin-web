package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by Comup on 2017/5/24.
 */
@Controller
class GreetingController {

    @RequestMapping("/index")
    fun greeting(): String {
        return "index"
    }
}