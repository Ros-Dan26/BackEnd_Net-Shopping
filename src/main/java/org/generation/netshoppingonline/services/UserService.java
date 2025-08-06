/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.services;

import java.util.List;
import java.util.NoSuchElementException;
import org.generation.netshoppingonline.exceptions.user.UserNotCreatedException;
import org.generation.netshoppingonline.exceptions.user.UserNotDeleteException;
import org.generation.netshoppingonline.exceptions.user.UserNotFoundException;
import org.generation.netshoppingonline.exceptions.user.UserNotLogInException;
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

    public User findById(int id) throws
            UserNotFoundException,
            NoSuchElementException {
        User u = userRepository.findById(id).get();
        if (u != null) {
            return u;
        } else {
            throw new UserNotFoundException();
        }
    }

    public User findByEmail(String email) throws UserNotFoundException {
        User u = userRepository.findByEmail(email);
        if (u != null) {
            return u;
        } else {
            throw new UserNotFoundException();
        }
    }

    public User findByPhone(String phone) throws UserNotFoundException {
        User u = userRepository.findByPhone(phone);

        if (u == null) {
            throw new UserNotFoundException();
        }
        return u;
    }

    public User findByNickname(String nickname) throws UserNotFoundException {
        User u = userRepository.findByNickname(nickname);

        if (u == null) {
            throw new UserNotFoundException();
        }
        return u;
    }

    public User findByMovil(String movil) throws UserNotFoundException {
        User u = userRepository.findByMobile(movil);
        if (u != null) {
            return u;
        } else {
            throw new UserNotFoundException();
        }
    }

    public User save(User user) throws UserNotCreatedException {
        User u = userRepository.save(user);

        if (u != null) {
            return u;
        } else {
            throw new UserNotCreatedException();
        }
    }

    public User update(User user) throws UserNotCreatedException {
        user.setUpdated();
        User u = userRepository.save(user);

        if (u != null) {
            return u;
        } else {
            throw new UserNotCreatedException();
        }
    }

    public void hardDelete(int id) throws
            UserNotDeleteException,
            NoSuchElementException {

        User userExist = findById(id);

        if (userExist != null) {
            userRepository.delete(userExist);
        } else {
            throw new UserNotDeleteException();
        }
    }

    public void softDelete(int id) throws
            UserNotDeleteException,
            NoSuchElementException {

        User userExist = findById(id);

        if (userExist != null) {
            if (userExist.getDeleted() == null) {
                userExist.setDeleted();
                userRepository.save(userExist);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            throw new UserNotDeleteException();
        }
    }

    public User login(String email, String password) throws UserNotLogInException {
        User u = userRepository.
                findAll().
                stream().
                filter(user
                        -> user.getEmail().equals(email)
                && user.getPassword().equals(password)).
                findFirst().
                orElseThrow();
        if (u == null) {
            throw new UserNotLogInException();
        } else {
            return u;
        }
    }
}
