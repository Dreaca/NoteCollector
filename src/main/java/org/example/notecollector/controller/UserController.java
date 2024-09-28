package org.example.notecollector.controller;

import org.example.notecollector.dto.impl.UserDTO;
import org.example.notecollector.service.UserService;
import org.example.notecollector.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO saveUser(
            @RequestPart("userFirstName") String userFirstName,
            @RequestPart("userLastName") String userLastName,
            @RequestPart("userEmail")String userEmail,
            @RequestPart("userPassword")String userPassword,
            @RequestPart("profilePicture") MultipartFile profilePicture
    ) {
        //profile picture convert to base64
        String base64ProPic = null;
        try {
            byte [] bytePic = profilePicture.getBytes();
            base64ProPic = AppUtil.convertProfilePictureToBase64(bytePic);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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

        userService.saveUser(buildUserDTO);

        return buildUserDTO;

    }
}
