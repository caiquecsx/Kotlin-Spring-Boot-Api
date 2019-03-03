package br.com.sevenc.ceepws.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping

@RestController
@RequestMapping("/")
class HomeController {
	
	@GetMapping
	fun home(): String{
		return "Hello Kotlin !"
	}
}