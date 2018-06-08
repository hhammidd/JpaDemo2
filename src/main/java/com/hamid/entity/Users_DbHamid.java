package com.hamid.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rel_utente_dbmmas")
public class Users_DbHamid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="utente_id", referencedColumnName="utente_id" )
    private Users users;

    @ManyToOne
    @JoinColumn(name = "db_id", referencedColumnName = "db_id")
    private DbHamid dbHamid;


    private String expire;

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public DbHamid getDbHamid() {
        return dbHamid;
    }

    public void setDbHamid(DbHamid dbHamid) {
        this.dbHamid = dbHamid;
    }
}
