package es.fplumara.dam2.spring_demo.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateNoteRequest(@NotBlank String text) {
}
