package com.in0c3nc10.games.games.domain;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

// ..com esta notação é criado uma tabela no database
@Entity
public class Games implements Serializable {

    // ..é usado como boa prática
    private static final long serialVersionUID = 1L;

    // ..informa ao JPA que o "id" é uma pk, e abaixo é o método de gerar o valor
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // ..define que ambos devem ser preenchidos, caso contrário retorna uma mensagem
    @NotEmpty(message = "Campo NOME é obrigatório!")
    @Length(min = 4, max = 150, message = "O campo NOME deve conter entre 3 e 150 caracteres!")
    private String name;

    @NotEmpty(message = "Campo RAÇA é obrigatório!")
    @Length(min = 2, max = 70, message = "O campo RAÇA deve conter entre 2 e 70 caracteres!")
    private String race;

    private Double price;

    @NotEmpty(message = "Campo STATUS é obrigatório!")
    @Length(min = 4, max = 70, message = "O campo STATUS deve conter entre 4 e 70 caracteres!")
    private String status;

    public Games() {
    }

    public Games(Integer id,
            @NotEmpty(message = "Campo NOME é obrigatório!") @Length(min = 4, max = 150, message = "O campo NOME deve conter entre 3 e 150 caracteres!") String name,
            @NotEmpty(message = "Campo RAÇA é obrigatório!") @Length(min = 2, max = 70, message = "O campo RAÇA deve conter entre 2 e 70 caracteres!") String race,
             Double price,
            @NotEmpty(message = "Campo STATUS é obrigatório!") @Length(min = 4, max = 70, message = "O campo STATUS deve conter entre 4 e 70 caracteres!") String status) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.price = price;
        this.status = status;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // ..hashcode do Id
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Games other = (Games) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
