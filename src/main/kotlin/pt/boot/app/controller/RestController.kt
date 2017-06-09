package pt.boot.app.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Vitor Oliveira on 06-06-2017.
 */

@RestController
class RestController {

    @GetMapping("/hello/{name}")
    fun get(@PathVariable name: String) = "Hello, $name"
}