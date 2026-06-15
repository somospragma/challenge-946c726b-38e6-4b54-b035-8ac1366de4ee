package com.pragma.loans.infrastructure.http.client;

import com.pragma.loans.domain.model.Loan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Component
public class ExternalServiceClient {
    private final RestTemplate restTemplate;
    private final String externalServiceUrl;

    public ExternalServiceClient(RestTemplate restTemplate, @Value("${external.service.url}") String externalServiceUrl) {
        this.restTemplate = restTemplate;
        this.externalServiceUrl = externalServiceUrl;
    }

    public List<Loan> fetchLoansFromExternalService() {
        // Lógica para llamar al servicio externo y obtener préstamos
        // Aquí se simularía la llamada a un servicio externo
        return List.of(new Loan(1L, "Préstamo externo", BigDecimal.valueOf(5000), LocalDate.now(), LocalDate.now().plusMonths(6)));
    }
}