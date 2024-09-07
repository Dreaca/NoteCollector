package org.example.notecollector.controller;

import org.example.notecollector.dto.impl.NoteDTO;
import org.example.notecollector.util.AppUtil;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/notes")
public class NoteController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public NoteDTO saveNote(NoteDTO noteDTO) {
        noteDTO.setNoteId(AppUtil.generateID());
        return noteDTO;
    }
    @GetMapping("/getSelectedNote")
    public NoteDTO getSelectedNote(){
        return null;
    }
    @GetMapping
    public List<NoteDTO> getAllNotes(){
        return null;
    }
    @DeleteMapping
    public void deleteSelectedNote(String noteId){

    }
    @PutMapping
    public void updateSelectedNote(String noteId,NoteDTO noteDTO){

    }

}
