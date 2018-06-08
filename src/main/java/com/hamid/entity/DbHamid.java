package com.hamid.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dbmmas")
public class DbHamid {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int db_id;

    @Column(unique = true)
    private String nome_db;

    private int censimento;
    private int versione;

    @Temporal(TemporalType.TIMESTAMP)
    private Date ins_data;

    @Temporal(TemporalType.TIMESTAMP)
    private Date mode_data;

    private int ins_utente;

    private int mod_utente;

    private int custom;

    private String nome_pers;

    private int nazione_id;

    public int getDb_id() {
        return db_id;
    }

    public void setDb_id(int db_id) {
        this.db_id = db_id;
    }

    public String getNome_db() {
        return nome_db;
    }

    public void setNome_db(String nome_db) {
        this.nome_db = nome_db;
    }

    public int getCensimento() {
        return censimento;
    }

    public void setCensimento(int censimento) {
        this.censimento = censimento;
    }

    public int getVersione() {
        return versione;
    }

    public void setVersione(int versione) {
        this.versione = versione;
    }

    public Date getIns_data() {
        return ins_data;
    }

    public void setIns_data(Date ins_data) {
        this.ins_data = ins_data;
    }

    public Date getMode_data() {
        return mode_data;
    }

    public void setMode_data(Date mode_data) {
        this.mode_data = mode_data;
    }

    public int getIns_utente() {
        return ins_utente;
    }

    public void setIns_utente(int ins_utente) {
        this.ins_utente = ins_utente;
    }

    public int getMod_utente() {
        return mod_utente;
    }

    public void setMod_utente(int mod_utente) {
        this.mod_utente = mod_utente;
    }

    public int getCustom() {
        return custom;
    }

    public void setCustom(int custom) {
        this.custom = custom;
    }

    public String getNome_pers() {
        return nome_pers;
    }

    public void setNome_pers(String nome_pers) {
        this.nome_pers = nome_pers;
    }

    public int getNazione_id() {
        return nazione_id;
    }

    public void setNazione_id(int nazione_id) {
        this.nazione_id = nazione_id;
    }

    @Override
    public String toString() {
        return "DbHamid{" +
                "db_id=" + db_id +
                ", nome_db='" + nome_db + '\'' +
                ", censimento=" + censimento +
                ", versione=" + versione +
                ", ins_data=" + ins_data +
                ", mode_data=" + mode_data +
                ", ins_utente=" + ins_utente +
                ", mod_utente=" + mod_utente +
                ", custom=" + custom +
                ", nome_pers='" + nome_pers + '\'' +
                ", nazione_id=" + nazione_id +
                '}';
    }
}
