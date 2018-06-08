package com.hamid.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dbmmas {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int db_id;

}
