package br.edu.exemplo.jogoenigma.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record ParticipanteRequest(@NotBlank String nome, @NotBlank @Email String email,
                                  @Min(0) @Max(100) Integer pontos) {
}
