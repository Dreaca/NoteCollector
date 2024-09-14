package org.example.notecollector.entity.impl;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.notecollector.entity.SuperEntity;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="note")
public class NoteEntity implements SuperEntity{
    @Id
    private String noteId;
    private String noteTitle;
    private String noteDesc;
    private String noteCreatedDate;
    private String priorityLevel;
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private UserEntity user;
}
