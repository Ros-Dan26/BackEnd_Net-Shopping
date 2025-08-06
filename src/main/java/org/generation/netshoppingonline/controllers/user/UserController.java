/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.controllers.user;

import java.net.URI;
import java.util.NoSuchElementException;
import org.generation.netshoppingonline.exceptions.user.UserNotCreatedException;
import org.generation.netshoppingonline.exceptions.user.UserNotDeleteException;
import org.generation.netshoppingonline.exceptions.user.UserNotFoundException;
import org.generation.netshoppingonline.exceptions.user.UserNotLogInException;
import org.generation.netshoppingonline.models.user.User;
import org.generation.netshoppingonline.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author jft
 */
@RestController
@RequestMapping(UserEndPoints.ROOT + UserEndPoints.USER)
public class UserController implements UserEndPoints {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(ALL)
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }

    @GetMapping(FIND + PARAM_ID)
    public ResponseEntity<?> findById(@PathVariable int id) {
        User u = null;
        try {
            u = userService.findById(id);
            System.out.println("id:" + id);
            return ResponseEntity.ok().body(u);

        } catch (UserNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        } catch (NoSuchElementException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(FIND + PARAM_EMAIL)
    public ResponseEntity<?> findByEmail(@PathVariable String email) {
        User u = null;
        try {
            u = userService.findByEmail(email);
            System.out.println("email:" + email);
            return ResponseEntity.ok().body(u);

        } catch (UserNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping(FIND + PARAM_PHONE)
    public ResponseEntity<?> findByPhone(@PathVariable String phone) {
        User u = null;
        try {
            u = userService.findByPhone(phone);
            System.out.println("phone:" + phone);
            return ResponseEntity.ok().body(u);

        } catch (UserNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping(FIND + PARAM_MOVIL)
    public ResponseEntity<?> findByMovil(@PathVariable String movil) {
        User u = null;
        try {
            u = userService.findByMovil(movil);
            System.out.println("movil:" + movil);
            return ResponseEntity.ok().body(u);

        } catch (UserNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(FIND + PARAM_NICKNAME)
    public ResponseEntity<?> findByNickname(@PathVariable String nickname) {
        User u = null;
        try {
            u = userService.findByNickname(nickname);
            System.out.println("nickname:" + nickname);
            return ResponseEntity.ok().body(u);

        } catch (UserNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(SAVE)
    public ResponseEntity<?> save(@RequestBody User user) {
        User u = null;
        URI uri = null;

        boolean emailExist
                = findByEmail(user.getEmail()).getStatusCode()
                == HttpStatus.ACCEPTED;
        boolean movilExist
                = findByMovil(user.getMobile()).getStatusCode()
                == HttpStatus.ACCEPTED;
        boolean phoneExist
                = findByPhone(user.getPhone()).getStatusCode()
                == HttpStatus.ACCEPTED;
        boolean nicknameExist
                = findByNickname(user.getNickname()).getStatusCode()
                == HttpStatus.ACCEPTED;
        try {

            /*
            if (!emailExist
                    && !movilExist
                    && !phoneExist
                    && !nicknameExist) {

                u = userService.save(user);
                uri = ServletUriComponentsBuilder.
                        fromCurrentRequest().
                        path(SAVE + PARAM_USER)
                        .buildAndExpand(user.toString())
                        .toUri();
                return ResponseEntity.created(uri).body(u);
            }
            return ResponseEntity.notFound().build();
            
             */
            System.out.println(UserNotCreatedException.generateDetails(
                    emailExist,
                    movilExist,
                    phoneExist, nicknameExist));
        } catch (UserNotCreatedException e) {
            System.out.println(UserNotCreatedException.generateDetails(
                    emailExist,
                    movilExist,
                    phoneExist, 
                    nicknameExist));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @PutMapping(UPDATE)
    public ResponseEntity<?> update(@RequestBody User user) {
        User u;
        try {
            u = userService.update(user);
            URI uri = ServletUriComponentsBuilder.
                    fromCurrentRequest().
                    path(SAVE + PARAM_USER)
                    .buildAndExpand(user.toString())
                    .toUri();
            return ResponseEntity.created(uri).body(u);
        } catch (UserNotCreatedException e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } catch (UserNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @DeleteMapping(HARD_DELETE)
    public ResponseEntity<?> hardDelete(@RequestBody User user) {
        try {
            userService.hardDelete(user);
            return ResponseEntity.ok().body("User: " + user + " deleted");
        } catch (UserNotDeleteException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        } catch (UserNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping(SOFT_DELETE)
    public ResponseEntity<?> softDelete(@RequestBody User user) {
        try {
            userService.softDelete(user);
            return ResponseEntity.ok().body("User: " + user._FullName() + " deleted");
        } catch (UserNotDeleteException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        } catch (UserNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    /*
    22323231
    */
    

    @PostMapping(LOGIN)
    public ResponseEntity<?> login(
            @RequestParam String email,
            @RequestParam String password) {
        User u;
        try {
            u = userService.login(email, password);
            return ResponseEntity.ok().body(u);
        } catch (UserNotLogInException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        } catch (UserNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }
    }
}
