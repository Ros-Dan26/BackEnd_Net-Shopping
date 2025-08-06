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
import org.generation.netshoppingonline.services.user.UserService;
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
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(u);

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
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(u);

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
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(u);

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
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(u);

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
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(u);

        } catch (UserNotFoundException e) {
            System.out.println(e);
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(SAVE)
    public ResponseEntity<?> save(@RequestBody User user) {
        User u = null;
        URI uri = null;

        try {
            if (!isExistUniqueParams(user)) {
                u = userService.save(user);
                uri = ServletUriComponentsBuilder.
                        fromCurrentRequest().
                        path(SAVE + PARAM_USER)
                        .buildAndExpand(user.toString())
                        .toUri();
                return ResponseEntity.created(uri).body(u);
            } else {
                return ResponseEntity.status(HttpStatus.CONFLICT).build();
            }
        } catch (UserNotCreatedException e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    /**
     * En este metodo los atributos email, nickname, phone y movile no se
     * actualizan debido a la restriccion en la base de datos. Se tendria que
     * crear un endpoint para cada campo para evitar un error interno de
     * servidor
     *
     * @param user
     * @return
     */
    @PutMapping(UPDATE)
    public ResponseEntity<?> update(@RequestBody User user) {
        User u = null;
        URI uri = null;

        try {
            User last = (User) findById(user.getId()).getBody();
            last.setFirstName(user.getFirstName());
            last.setGendersId(user.getGendersId());
            last.setLastName(user.getLastName());
            last.setMiddleName(last.getMiddleName());
            last.setPassword(user.getPassword());
            last.setPreferences(user.getPreferences());
            u = userService.save(last);

            uri = ServletUriComponentsBuilder.
                    fromCurrentRequest().
                    path(SAVE + PARAM_USER)
                    .buildAndExpand(user.toString())
                    .toUri();
            return ResponseEntity.created(uri).body(u);

        } catch (UserNotCreatedException e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } catch (NoSuchElementException e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } catch (NullPointerException e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping(HARD_DELETE + PARAM_ID)
    public ResponseEntity<?> hardDelete(@PathVariable int id) {
        try {
            userService.hardDelete(id);
            return ResponseEntity.ok().build();
        } catch (UserNotDeleteException e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        } catch (NoSuchElementException e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PutMapping(SOFT_DELETE + PARAM_ID)
    public ResponseEntity<?> softDelete(@PathVariable int id) {
        try {
            userService.softDelete(id);
            return ResponseEntity.ok().build();
        } catch (UserNotDeleteException e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        } catch (NoSuchElementException e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
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
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        } 
    }

    private boolean isExistUniqueParams(User user) {
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
        System.out.println(emailExist
                + " " + movilExist
                + " " + phoneExist
                + " " + nicknameExist);
        return emailExist
                || movilExist
                || phoneExist
                || nicknameExist;
    }
}
