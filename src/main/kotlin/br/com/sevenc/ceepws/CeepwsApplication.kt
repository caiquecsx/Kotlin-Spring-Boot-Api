package br.com.sevenc.ceepws

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CeepwsApplication

fun main(args: Array<String>) {
	runApplication<CeepwsApplication>(*args)
}
