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
        noteDTOList.add(new NoteDTO("NOTE-1824e626-685c-4e35-8a49-3ed6ee005f2a","Python","PythonDesc",
                "20240914","P1","2"));
        noteDTOList.add(new NoteDTO("NOTE-1824e626-685c-4e35-8a49-3ed6ee005f5a","JS","JavaScriptDesc",
                "20240914","P3","4"));
        noteDTOList.add(new NoteDTO("NOTE-1824e626-685c-4e35-8a49-3ed6ee005dda","Kotlin","KotlinDesc",
                "20240914","P1","1"));
        noteDTOList.add(new NoteDTO("NOTE-1824e626-685c-4e35-8a49-3ed6ee005gga","TS","TSDesc",
                "20240914","P2","2"));}

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
