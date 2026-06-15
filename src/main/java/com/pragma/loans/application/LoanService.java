package com.pragma.loans.application;

import com.pragma.loans.domain.model.Loan;
import com.pragma.loans.infrastructure.http.client.ExternalServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LoanService {
    private final ExternalServiceClient externalServiceClient;

    @Autowired
    public LoanService(ExternalServiceClient externalServiceClient) {
        this.externalServiceClient = externalServiceClient;
    }

    public List<Loan> getAllLoans() {
        // Lógica de negocio aquí...
        return externalServiceClient.fetchLoansFromExternalService();
    }

    // Otros métodos de servicio aquí...
}