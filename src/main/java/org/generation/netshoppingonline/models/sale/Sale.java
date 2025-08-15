/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.generation.netshoppingonline.models.sale;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

/**
 *
 * @author JesusFloresTemahuay
 */
@Entity
@Table(name = "sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "id_user")
    private int idUser;

    @Column(name = "id_shipment")
    private int idShipment;

    @Column(name = "payment_details")
    private String paymentDetails;

    @Column(name = " time_sale")
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime timeSale;

    @Column(name = " discount", columnDefinition = "DECIMAL(8,2)")
    private double discount;

    public Sale() {
        timeSale = LocalDateTime.now();
    }

    public Sale(
            int id,
            int idUser,
            int idShipment,
            String paymentDetails,
            LocalDateTime timeSale,
            double discount) {
        this.id = id;
        this.idUser = idUser;
        this.idShipment = idShipment;
        this.paymentDetails = paymentDetails;
        this.timeSale = timeSale;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Sale{" + "id=" + id
                + ", idUser=" + idUser
                + ", idShipment=" + idShipment
                + ", paymentDetails=" + paymentDetails
                + ", timeSale=" + timeSale
                + ", discount=" + discount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + this.idUser;
        hash = 59 * hash + this.idShipment;
        hash = 59 * hash + Objects.hashCode(this.paymentDetails);
        hash = 59 * hash + Objects.hashCode(this.timeSale);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.discount) ^ (Double.doubleToLongBits(this.discount) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sale other = (Sale) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idUser != other.idUser) {
            return false;
        }
        if (this.idShipment != other.idShipment) {
            return false;
        }
        if (Double.doubleToLongBits(this.discount) != Double.doubleToLongBits(other.discount)) {
            return false;
        }
        if (!Objects.equals(this.paymentDetails, other.paymentDetails)) {
            return false;
        }
        return Objects.equals(this.timeSale, other.timeSale);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdShipment() {
        return idShipment;
    }

    public void setIdShipment(int idShipment) {
        this.idShipment = idShipment;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public LocalDateTime getTimeSale() {
        return timeSale;
    }

    public void setTimeSale(LocalDateTime timeSale) {
        this.timeSale = timeSale;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
