package com.dscatalog.DsCatalog.entities;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable {
    private Long id;
    private String Nome;

    public Category() {
    }

    public Category(Long id, String Nome) {
        this.id = id;
        this.Nome = Nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category category)) return false;
        return getId().equals(category.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
