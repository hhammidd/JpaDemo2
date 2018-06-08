package com.hamid.services;
import com.hamid.entity.Permesso;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicePermesso {
    public void doServicePermesso(EntityManager em) {
        List<Integer> permesso_id;
        permesso_id = findAllId(em);

        filterPerName(em);


    }

    /**
     * This method just search and Filter the
     * permesso name which searched
     * you can also restrict some with another column
     * @param em
     */
    private void filterPerName(EntityManager em) {
        System.out.println("Please enter the name: ");
        Scanner sc = new Scanner(System.in);
        //Debug : String name = "Sel";

        String name = sc.nextLine();

        TypedQuery<Permesso> query = em.createQuery("select p from com.hamid.entity.Permesso p where p.nome like '%"+ name
                + "%'" , Permesso.class);

        List<Permesso> perList = query.getResultList();

        for (Permesso p : perList) {
            System.out.println(p.getNome());
        }
    }

    /**
     * Will Return back [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 30]
     * An array of permesso_id
     * @param em
     * @return
     */
    private List<Integer> findAllId(EntityManager em) {
        TypedQuery<Permesso> permessoQuery = em.createQuery("SELECT c FROM com.hamid.entity.Permesso c", Permesso.class);
        List<Permesso> permessoRes = permessoQuery.getResultList();
        List<Integer> p_id = new ArrayList<Integer>();
        for (Permesso p : permessoRes) {
            int p_id1 = p.getPermesso_id();
            p_id.add(p_id1);
        }
        return p_id;
    }
}
