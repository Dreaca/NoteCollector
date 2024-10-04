package org.example.notecollector.service;

import org.example.notecollector.dto.NoteStatus;
import org.example.notecollector.dto.impl.NoteDTO;

import java.util.List;

public interface NoteService {
    void saveNote(NoteDTO notedto);
    List<NoteDTO> getAllNotes();
    NoteStatus getSelectedNote(String noteId);
    void deleteNote(String noteId);
    void updateSelectedNote(String noteId,NoteDTO noteDTO);
}
