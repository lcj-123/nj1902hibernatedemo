package com.qf.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by DELL on 2019/8/15.
 */
public abstract class BaseDao {

    private static final Configuration configure = new Configuration().configure();
    //创建session工厂
    private static final SessionFactory sessionFactory =  configure.buildSessionFactory();

    protected Session getSession(){
        Session session = sessionFactory.openSession();
        return session;
    }

//    public boolean<T> update(T t){
//
//    }
}
