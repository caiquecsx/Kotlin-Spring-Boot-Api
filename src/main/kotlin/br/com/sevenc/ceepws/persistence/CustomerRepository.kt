package br.com.sevenc.ceepws.persistence

import org.springframework.data.repository.CrudRepository
import br.com.sevenc.ceepws.model.Customer

interface CustomerRepository : CrudRepository<Customer, Long>