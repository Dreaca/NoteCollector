package org.example.notecollector.service;

import org.example.notecollector.dto.impl.NoteDTO;

import java.util.List;

public interface NoteService {
    NoteDTO saveNote(NoteDTO notedto);
    List<NoteDTO> getAllNotes();
    NoteDTO getSelectedNote(String noteId);
    void deleteNote(String noteId);
    void updateSelectedNote(String noteId,NoteDTO noteDTO);
}
