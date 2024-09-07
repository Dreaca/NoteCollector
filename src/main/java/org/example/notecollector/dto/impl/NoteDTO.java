package org.example.notecollector.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.notecollector.dto.SuperDTO;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoteDTO implements SuperDTO {
    private String noteId;
    private String noteTitle;
    private String noteDesc;
    private String noteCreatedDate;
    private String priorityLevel;
    private String userId;
}
