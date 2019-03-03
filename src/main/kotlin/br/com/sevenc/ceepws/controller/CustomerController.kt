package br.com.sevenc.ceepws.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import br.com.sevenc.ceepws.persistence.CustomerRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import br.com.sevenc.ceepws.model.Customer
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable

@RestController
@RequestMapping("customers")
class CustomerController(val repository: CustomerRepository) {
	
	@GetMapping
	fun findAll() = repository.findAll()
	
	@PostMapping
	fun addCustomer( @RequestBody customer: Customer)
		= repository.save(customer)
	
	@DeleteMapping("/{id}")
    fun removeCustomer(@PathVariable id: Long)
            = repository.deleteById(id)

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long)
            = repository.findById(id)
}