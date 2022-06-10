package com.ifba.lab2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="table_artigo")
@Table(name="table_artigo")

public class Avaliador {
    @Id
    BigInteger id;

    @Column(name = "nome_avaliador")
    String Nome;

    @Column(name = "email_avaliador")
    String Email;

    @Column(name = "tema_avaliador")
    String[] Tema;


    List<Avaliador> avaliadores = new ArrayList<>();
    
    public void AvaliadorChefe(){}
    
    public void AvaliarCriterios(){}
    
    public void VerificaListadeArtigos(){}
    
}
