package org.example.notecollector.dao;

import org.example.notecollector.entity.impl.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteDao extends JpaRepository<NoteEntity, String> {
}
