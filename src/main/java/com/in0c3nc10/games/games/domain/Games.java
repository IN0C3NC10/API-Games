package com.in0c3nc10.games.games.domain;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

// ..com esta notação é criado uma tabela no database
@Entity
public class Games implements Serializable{

    // ..é usado como boa prática o Serializable
    private static final long serialVersionUID=1L;

    // ..informa ao JPA que o "id" é uma pk, e abaixo é o método de gerar o valor
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // ..define que ambos devem ser preenchidos, caso contrário retorna uma mensagem
    @NotEmpty(message = "Campo NOME é obrigatório!")
    @Length(min = 4, max = 150, message = "O campo NOME deve conter entre 3 e 150 caracteres!")
    private String name;
    @NotEmpty(message = "Campo CATEGORIA é obrigatório!")
    @Length(min = 2, max = 70, message = "O campo CATEGORIA deve conter entre 2 e 70 caracteres!")
    private String category;
    
    // ..construtores
    public Games() {
    }

    public Games(Integer id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    // ..gets and sets
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
        this.name = name.toUpperCase();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category.toUpperCase();
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
