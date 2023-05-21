package com.mytestp.testp.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long paymentId;

    @NotNull( message = "Payment amount can not be empty")
    @Length(max = 22, min = 2)
    // @Future
    // @FutureOrPresent
    // @Size

    private double paymentAmount;
    private String paymentMethod;
    private String paidByName;
}
