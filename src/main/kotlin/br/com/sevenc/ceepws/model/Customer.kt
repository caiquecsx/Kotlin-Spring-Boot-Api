package br.com.sevenc.ceepws.model

import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Entity

@Entity
data class Customer (
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	var id: Long = 0,
	var firstName: String = "",
	var lastName: String = ""
)