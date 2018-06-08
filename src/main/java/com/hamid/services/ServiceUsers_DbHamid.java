package com.hamid.services;

import com.hamid.entity.DbHamid;
import com.hamid.entity.Users;
import com.hamid.entity.Users_DbHamid;

import javax.persistence.EntityManager;
import java.util.Date;

public class ServiceUsers_DbHamid {
    public void doServiceUsers_DbHamid(EntityManager em) {
        insertRelUserDbHamid(em);
    }

    private void insertRelUserDbHamid(EntityManager em) {
        Users_DbHamid ud = new Users_DbHamid();
        DbHamid dh = new DbHamid();
        Users u = new Users();

        String exprie = "2015-07-14 12:46:41";
        dh.setDb_id(4);
        u.setUtente_id(6);
        ud.setExpire(exprie);
        ud.setDbHamid(dh);
        ud.setUsers(u);
        em.persist(ud);
    }
}
