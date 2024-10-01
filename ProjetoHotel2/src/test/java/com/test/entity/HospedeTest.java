package com.test.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HospedeTest {
	private Hospede hospede;

	@BeforeEach
	void setUp(){
		//Arrange
			hospede = new Hospede(1L, "Pedro Henrique", "pedro@gmail.com", "159984456030" );
	}
	

	@Test
	@DisplayName("Testando o getter e setter do campo Id")
	void testId() {
		//Act
		hospede.setId(2L);
		//Assert
		assertEquals(2L, hospede.getId());
	}
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		//Act
		hospede.setNome("Joao Paulo");
		//Assert
		assertEquals("Joao Paulo", hospede.getNome());
	}
	@Test
	@DisplayName("Testando o getter e setter do campo email")
	void testEmail() {
		//Act
		hospede.setEmail("jp@gmail.com");
		//Assert
		assertEquals("jp@gmail.com", hospede.getEmail());
	}
	@Test
	@DisplayName("Testando o getter e setter do campo telefone")
	void testTelefone() {
		//Act
		hospede.setTelefone("159984956031");
		//Assert
		assertEquals("159984956031", hospede.getTelefone());
	}
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testeConstrutorAll() {
		//Act
		Hospede novoHospede = new Hospede(3L, "Matheus", "matheus@gmail.com", "15997425603");
		//Assertion
		assertAll("novoHospede",
				()-> assertEquals(3L,novoHospede.getId()),
				()-> assertEquals("Matheus", novoHospede.getNome()),
				()-> assertEquals("matheus@gmail.com",novoHospede.getEmail()),
				()-> assertEquals("15997425603", novoHospede.getTelefone()));
		
	}

}
