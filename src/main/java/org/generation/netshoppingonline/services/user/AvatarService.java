/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.services.user;

import org.generation.netshoppingonline.exceptions.products.ImageNotAddException;
import org.generation.netshoppingonline.models.user.Avatar;
import org.generation.netshoppingonline.repositories.user.AvatarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JesusFloresTemahuay
 */
@Service
public class AvatarService {

    private final AvatarRepository avatarRepository;

    @Autowired
    public AvatarService(AvatarRepository avatarRepository) {
        this.avatarRepository = avatarRepository;
    }

    public Avatar findByUserId(int idUser) {
        return avatarRepository.findByUserId(idUser);
    }

    public void addAvatar(String url, int id) throws
            ImageNotAddException {

        Avatar a = new Avatar(0, id, url);
        a = avatarRepository.save(a);
        if (a == null) {
            throw new ImageNotAddException("Avatar no agregado a usuario");
        }
    }

    public Avatar save(Avatar avatar) {
        Avatar a = avatarRepository.save(avatar);
        if (a != null) {
            return a;
        } else {
            throw new ImageNotAddException("Avatar no agregado a usuario");
        }
    }
}
