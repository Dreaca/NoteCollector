package org.example.notecollector.service.impl;

import org.example.notecollector.dto.impl.NoteDTO;
import org.example.notecollector.service.NoteService;
import org.example.notecollector.util.AppUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class NoteServiceImpl implements NoteService {

    private static final List<NoteDTO> noteDTOList = new ArrayList<>();

    public NoteServiceImpl() {
    }

    @Override
    public NoteDTO saveNote(NoteDTO noteDTO) {
        noteDTO.setNoteId(AppUtil.generateID());
        return noteDTO;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        return noteDTOList;
    }

    @Override
    public NoteDTO getSelectedNote(String noteId) {
        return null;
    }

    @Override
    public void deleteNote(String noteId) {

    }

    @Override
    public void updateSelectedNote(String noteId, NoteDTO noteDTO) {

    }
}
