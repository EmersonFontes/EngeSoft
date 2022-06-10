package com.ifba.lab2.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="table_autor")
@Table(name="table_autor")

public class Autor {

    @Id
    private BigInteger id;

    @Column(name = ("nome_autor"))
    private String nome;

    @Column(name = ("email_autor"))
    private String email;

    @Column(name = ("instituicao_autor"))
    private String intituicao;

    @Column(name = ("endereco_autor"))
    private String endereco;

    @ManyToMany
    @JoinTable(name = "trabalhos_pessoas")
     List<Artigo> artigos =new ArrayList<>();

}
