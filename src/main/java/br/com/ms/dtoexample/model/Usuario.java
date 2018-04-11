package br.com.ms.dtoexample.model;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor // JPA Only
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String senha;
    private boolean admin;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    @PrePersist
    private void onCreate(){
        this.admin = false;
    }
}

