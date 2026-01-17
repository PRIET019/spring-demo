package es.fplumara.dam2.spring_demo.repositories;

import es.fplumara.dam2.spring_demo.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> { }