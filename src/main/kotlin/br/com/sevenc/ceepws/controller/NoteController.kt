package br.com.sevenc.ceepws.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import br.com.sevenc.ceepws.model.Note
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import khttp.responses.Response
import khttp.get

@RestController
@RequestMapping("notes")
class NoteController {
	
	@GetMapping("list")
	fun list(): List<Note>{
		
		return listOf(Note("Leitura", "Livro 01"),
			Note("Pesquisa", "Teste 02"))
	}
}