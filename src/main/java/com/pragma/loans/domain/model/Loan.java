package com.pragma.loans.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Loan(Long id, String name, BigDecimal amount, LocalDate startDate, LocalDate endDate) {
}