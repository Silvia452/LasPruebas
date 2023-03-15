package ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ClaseCadenaTest {

    @InjectMocks
    private ClaseCadena underTest;

    @Test
    void main() {
    }

    @Test
    void devuelveIniciales() {
    }

    @Nested
    class WhenMaining {
        @Mock
        private String[] args;

        @BeforeEach
        void setup() {
        }
    }
}

