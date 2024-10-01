
package com.test.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate checkIn;
	
	private LocalDate checkOut;
	
	@ManyToOne
	@JoinColumn(name = "id_hospede")
	private Hospede hospede;
	
	@ManyToOne
	@JoinColumn(name = "id_quarto")
	private Quarto quarto;
	
	
	
}
