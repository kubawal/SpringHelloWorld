package com.mfkw.helloworld

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class RootController {

    @GetMapping("/")
    fun root(model: Model): String {
        model["title"] = "Hello World"
        return "root/root"
    }
}