package br.edu.exemplo.jogoenigma.service;

import br.edu.exemplo.jogoenigma.dto.ParticipanteRequest;
import br.edu.exemplo.jogoenigma.repository.ParticipanteRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ParticipanteServiceTest {
    @Test
    void deveImpedirEmailDuplicado() {
        var r = mock(ParticipanteRepository.class);
        when(r.findByEmail("a@b.com")).thenReturn(Optional.of(mock(br.edu.exemplo.jogoenigma.entity.Participante.class)));
        var s = new ParticipanteService(r);
        assertThrows(IllegalArgumentException.class, () -> s.criar(new ParticipanteRequest("A", "a@b.com", 10)));
    }
}
