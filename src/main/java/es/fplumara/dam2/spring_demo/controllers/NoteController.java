package es.fplumara.dam2.spring_demo.controllers;

import es.fplumara.dam2.spring_demo.domain.Note;
import es.fplumara.dam2.spring_demo.dto.CreateNoteRequest;
import es.fplumara.dam2.spring_demo.repositories.NoteRepository;
import es.fplumara.dam2.spring_demo.services.NoteService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public ResponseEntity<Note> create(@Valid @RequestBody CreateNoteRequest req) {
        Note saved = noteService.createNoteWithAudit(req.text());
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public List<Note> all() {
        return noteService.findAll();
    }
}