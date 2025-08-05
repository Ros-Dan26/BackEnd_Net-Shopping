/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.services;

import java.util.List;
import org.generation.netshoppingonline.exceptions.user.UserNotCreatedException;
import org.generation.netshoppingonline.exceptions.user.UserNotDeleteException;
import org.generation.netshoppingonline.exceptions.user.UserNotFoundException;
import org.generation.netshoppingonline.models.user.User;
import org.generation.netshoppingonline.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jft
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(int id) {
        User u
                = userRepository.
                        findAll().stream().
                        filter(user -> user.getId() == id).
                        findFirst().orElseThrow();
        if (u != null) {
            return u;
        } else {
            throw new UserNotFoundException();
        }
    }

    public User findByEmail(String email) {
        User u = userRepository.
                findAll().stream().
                filter(user -> user.getEmail().equalsIgnoreCase(email)).
                findFirst().orElseThrow();
        if (u != null) {
            return u;
        } else {
            throw new UserNotFoundException();
        }
    }

    public User findByPhone(String phone) {
        User u = userRepository.
                findAll().stream().
                filter(user -> user.getPhone().equalsIgnoreCase(phone)).
                findFirst().orElseThrow();
        if (u != null) {
            return u;
        } else {
            throw new UserNotFoundException();
        }
    }

    public User findByMovil(String movil) {
        User u = userRepository.
                findAll().stream().
                filter(user -> user.getMobile().equalsIgnoreCase(movil)).
                findFirst().orElseThrow();
        if (u != null) {
            return u;
        } else {
            throw new UserNotFoundException();
        }
    }

    public User save(User user) {
        User u = null;
        boolean emailExist = findByEmail(user.getEmail()) != null;
        boolean movilExist = findByMovil(user.getMobile()) != null;
        boolean phoneExist = findByPhone(user.getPhone()) != null;

        if (!emailExist
                || !movilExist
                || !phoneExist) {
            u = userRepository.save(user);
        }
        if (u != null) {
            return u;
        } else {
            throw new UserNotCreatedException(
                    UserNotCreatedException.generateDetails(
                            emailExist,
                            movilExist,
                            phoneExist));
        }
    }

    public User update(User user) {
        User u = null;
        boolean emailExist = findByEmail(user.getEmail()) != null;
        boolean movilExist = findByMovil(user.getMobile()) != null;
        boolean phoneExist = findByPhone(user.getPhone()) != null;

        if (!emailExist
                || !movilExist
                || !phoneExist) {

            user.setUpdated();
            return userRepository.save(user);
        } else {
            throw new UserNotCreatedException(
                    UserNotCreatedException.generateDetails(
                            emailExist,
                            movilExist,
                            phoneExist));
        }
    }

    public void hardDelete(User user) {

        boolean userExist = findById(user.getId()) != null;

        if (userExist) {
            userRepository.delete(user);
        } else {
            throw new UserNotDeleteException();
        }
    }

    public void softDelete(User user) {
        boolean userExist = findById(user.getId()) != null;
        if (userExist) {
            user.setDeleted();
            userRepository.save(user);
        } else {
            throw new UserNotDeleteException();
        }
    }
}
