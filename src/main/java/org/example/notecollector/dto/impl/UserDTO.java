package org.example.notecollector.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String userId;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userPassword;
    private String profilePicture;
    private List<NoteDTO> notes;
}
