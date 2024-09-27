package org.example.notecollector.controller;

import org.example.notecollector.dto.impl.UserDTO;
import org.example.notecollector.util.AppUtil;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO saveUser(
           @RequestPart("userFirstName") String userFirstName,
           @RequestPart("userLastName") String userLastName,
           @RequestPart("userEmail")String userEmail,
           @RequestPart("userPassword")String userPassword,
           @RequestPart("profilePicture")String profilePicture
    ) {
        //profile picture convert to base64
        String base64ProPic = AppUtil.convertProfilePictureToBase64(profilePicture);
        //UserId generate
        String userId = AppUtil.generateUserID();
        // Todo: Build the object

        var buildUserDTO = new UserDTO();

        buildUserDTO.setUserId(userId);
        buildUserDTO.setUserFirstName(userFirstName);
        buildUserDTO.setUserLastName(userLastName);
        buildUserDTO.setUserEmail(userEmail);
        buildUserDTO.setUserPassword(userPassword);
        buildUserDTO.setProfilePicture(base64ProPic);

        return buildUserDTO;

    }
}
