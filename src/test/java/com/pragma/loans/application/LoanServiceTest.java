package com.pragma.loans.application;

import com.pragma.loans.domain.model.Loan;
import com.pragma.loans.infrastructure.http.client.ExternalServiceClient;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoanServiceTest {
    @Autowired
    private LoanService loanService;

    @MockBean
    private ExternalServiceClient externalServiceClient;

    @Test
    void testGetAllLoans() {
        // Configuración del mock
        Mockito.when(externalServiceClient.fetchLoansFromExternalService()).thenReturn(List.of(new Loan(1L, "Préstamo 1", BigDecimal.valueOf(1000), LocalDate.now(), LocalDate.now().plusMonths(1))));

        // Ejecución del método a probar
        List<Loan> loans = loanService.getAllLoans();

        // Aserciones
        assertNotNull(loans);
        assertEquals(1, loans.size());
        assertEquals("Préstamo 1", loans.get(0).name());
    }
}