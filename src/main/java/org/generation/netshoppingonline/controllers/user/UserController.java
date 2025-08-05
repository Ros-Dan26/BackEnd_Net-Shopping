/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.controllers.user;

import org.generation.netshoppingonline.controllers.user.UserEndPoints;
import java.net.URI;
import org.generation.netshoppingonline.models.user.User;
import org.generation.netshoppingonline.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
        User u = userService.findById(id);
        if (u != null) {
            return ResponseEntity.ok().body(u);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(FIND + PARAM_EMAIL)
    public ResponseEntity<?> findByEmail(@PathVariable String email) {
        User u = userService.findByEmail(email);
        if (u != null) {
            return ResponseEntity.ok().body(u);
        } else {
            return ResponseEntity.noContent().build();
        }

    }

    @GetMapping(FIND + PARAM_PHONE)
    public ResponseEntity<?> findByPhone(@PathVariable String phone) {
        User u = userService.findByPhone(phone);
        if (u != null) {
            return ResponseEntity.ok().body(u);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping(FIND + PARAM_MOVIL)
    public ResponseEntity<?> findByMovil(@PathVariable String movil) {
        User u = userService.findByMovil(movil);
        if (u != null) {
            return ResponseEntity.ok().body(u);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping(SAVE)
    public ResponseEntity<?> save(@RequestBody User user) {
        User u = userService.save(user);
        if (u != null) {
            URI uri = ServletUriComponentsBuilder.
                    fromCurrentRequest().
                    path(SAVE + PARAM_USER)
                    .buildAndExpand(user.toString())
                    .toUri();
            return ResponseEntity.created(uri).body(u);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping(UPDATE)
    public ResponseEntity<?> update(@RequestBody User user) {
        User u = userService.update(user);
        if (u != null) {
            URI uri = ServletUriComponentsBuilder.
                    fromCurrentRequest().
                    path(SAVE + PARAM_USER)
                    .buildAndExpand(user.toString())
                    .toUri();
            return ResponseEntity.created(uri).body(u);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @DeleteMapping(HARD_DELETE)
    public ResponseEntity<?> hardDelete(@RequestBody User user) {
        userService.hardDelete(user);
        return ResponseEntity.ok().body("User: " + user + " deleted");
    }

    @PutMapping(SOFT_DELETE)
    public ResponseEntity<?> softDelete(@RequestBody User user) {
        userService.softDelete(user);
        return ResponseEntity.ok().body("User: " + user._FullName() + " deleted");
    }

}
