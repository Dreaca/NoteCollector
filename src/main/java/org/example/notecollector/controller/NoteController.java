package org.example.notecollector.controller;

import org.example.notecollector.dto.impl.NoteDTO;
import org.example.notecollector.service.NoteService;
import org.example.notecollector.service.impl.NoteServiceImpl;
import org.example.notecollector.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteDTO saveNote(@RequestBody NoteDTO noteDTO) {

       return noteService.saveNote(noteDTO);
    }
    @GetMapping("/getSelectedNote")
    public NoteDTO getSelectedNote(String noteId){
        return null;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<NoteDTO> getAllNotes(){
        return noteService.getAllNotes();
    }
    @DeleteMapping
    public void deleteSelectedNote(String noteId){

    }
    @PutMapping
    public void updateSelectedNote(String noteId,NoteDTO noteDTO){

    }

}
