package com.kapped.springbootjpa.service;

import com.kapped.springbootjpa.beans.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user){
       entityManager.persist(user);
       return user.getId();
    }
}
