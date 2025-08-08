package org.generation.netshoppingonline.controllers.UserControllerDTO;

import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {

    public static UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());

        // Gender
        if (user.getGender() != null) {
            GenderDTO genderDTO = new GenderDTO();
            genderDTO.setId(user.getGender().getId());
            genderDTO.setName(user.getGender().getName());
            dto.setGender(genderDTO);
        }

        // Addresses
        dto.setAddresses(user.getAddresses().stream().map(addr -> {
            AddressDTO dtoAddr = new AddressDTO();
            dtoAddr.setId(addr.getId());
            dtoAddr.setStreet(addr.getStreet());
            dtoAddr.setCity(addr.getCity());
            dtoAddr.setState(addr.getState());
            dtoAddr.setZip(addr.getZip());
            return dtoAddr;
        }).collect(Collectors.toList()));

        // CdCards
        dto.setCdCards(user.getCdCards().stream().map(card -> {
            CdCardDTO dtoCard = new CdCardDTO();
            dtoCard.setId(card.getId());
            dtoCard.setCardNumber(card.getCardNumber());
            dtoCard.setCardHolder(card.getCardHolder());
            dtoCard.setExpirationDate(card.getExpirationDate());
            return dtoCard;
        }).collect(Collectors.toList()));

        // Paypals
        dto.setPaypals(user.getPaypals().stream().map(pp -> {
            PaypalDTO dtoPP = new PaypalDTO();
            dtoPP.setId(pp.getId());
            dtoPP.setEmail(pp.getEmail());
            return dtoPP;
        }).collect(Collectors.toList()));

        // BankTransfers
        dto.setBankTransfers(user.getBankTransfers().stream().map(bt -> {
            BankTransferDTO dtoBT = new BankTransferDTO();
            dtoBT.setId(bt.getId());
            dtoBT.setAccountNumber(bt.getAccountNumber());
            dtoBT.setBankName(bt.getBankName());
            return dtoBT;
        }).collect(Collectors.toList()));

        return dto;
    }
}