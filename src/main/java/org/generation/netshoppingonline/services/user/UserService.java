/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.services.user;

import java.util.List;
import java.util.NoSuchElementException;
import org.generation.netshoppingonline.exceptions.user.UserNotCreatedException;
import org.generation.netshoppingonline.exceptions.user.UserNotDeleteException;
import org.generation.netshoppingonline.exceptions.user.UserNotFoundException;
import org.generation.netshoppingonline.exceptions.user.UserNotLogInException;
import org.generation.netshoppingonline.models.user.User;
import org.generation.netshoppingonline.models.user.UserView;
import org.generation.netshoppingonline.repositories.user.UserRepository;
import org.generation.netshoppingonline.repositories.user.UserViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JesusFloresTemahuay
 */
@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserViewRepository userViewRepository;

    @Autowired
    public UserService(UserRepository userRepository,
            UserViewRepository userViewRepository) {
        this.userRepository = userRepository;
        this.userViewRepository = userViewRepository;
    }

    public List<UserView> findAll() {
        return userViewRepository.findAll();
    }

    public UserView findById(int id) throws
            UserNotFoundException,
            NoSuchElementException {
        UserView u = userViewRepository.findById(id).get();
        if (u != null) {
            return u;
        } else {
            throw new UserNotFoundException();
        }
    }

    public UserView findByEmail(String email) throws UserNotFoundException {
        UserView u = userViewRepository.findByEmail(email);
        if (u != null) {
            return u;
        } else {
            throw new UserNotFoundException();
        }
    }

    public UserView findByPhone(String phone) throws UserNotFoundException {
        UserView u = userViewRepository.findByPhone(phone);

        if (u == null) {
            throw new UserNotFoundException();
        }
        return u;
    }

    public UserView findByNickname(String nickname) throws UserNotFoundException {
        UserView u = userViewRepository.findByNickname(nickname);

        if (u == null) {
            throw new UserNotFoundException();
        }
        return u;
    }

    public UserView findByMovil(String movil) throws UserNotFoundException {
        UserView u = userViewRepository.findByMobile(movil);
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

        UserView userExist = findById(id);

        if (userExist != null) {
            User u = new User(
                    userExist.getId(),
                    userExist.getGendersId(),
                    userExist.getFirstName(),
                    userExist.getLastName(),
                    userExist.getMiddleName(),
                    userExist.getPreferences(),
                    userExist.getEmail(),
                    userExist.getPhone(),
                    userExist.getMobile(),
                    userExist.getNickname(),
                    userExist.getPassword());
            u.setCreated(userExist.getCreated());
            u.setUpdated(userExist.getUpdated());
            u.setDeleted(userExist.getDeleted());
            userRepository.delete(u);
        } else {
            throw new UserNotDeleteException();
        }
    }

    public void softDelete(int id) throws
            UserNotDeleteException,
            NoSuchElementException {

        UserView userExist = findById(id);

        if (userExist != null) {
            if (userExist.getDeleted() == null) {
                User u = new User(
                        userExist.getId(),
                        userExist.getGendersId(),
                        userExist.getFirstName(),
                        userExist.getLastName(),
                        userExist.getMiddleName(),
                        userExist.getPreferences(),
                        userExist.getEmail(),
                        userExist.getPhone(),
                        userExist.getMobile(),
                        userExist.getNickname(),
                        userExist.getPassword());
                u.setCreated(userExist.getCreated());
                u.setUpdated(userExist.getUpdated());
                u.setDeleted();
                userRepository.save(u);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            throw new UserNotDeleteException();
        }
    }

    public User login(String email, String password) throws UserNotLogInException {
        User u = userRepository.login(email, password);
        if (u == null) {
            throw new UserNotLogInException();
        } else {
            return u;
        }
    }
}
