package com.bl.mockito;

public class CustomerReader {

    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public String findFullName(long id) {
       return this.entityManager.find( Customer.class,id ).getName();
    }
}
