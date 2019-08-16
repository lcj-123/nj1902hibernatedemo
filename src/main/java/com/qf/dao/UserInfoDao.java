package com.qf.dao;

import com.qf.pojo.UserInfo;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by DELL on 2019/8/15.
 */
public class UserInfoDao extends BaseDao{

    public UserInfo getUserById(int id){
        return this.getSession().get(UserInfo.class,id);
    }

    public boolean updateUserInfo(UserInfo userInfo){
        Session session = this.getSession();
        Transaction transaction = session.beginTransaction();
        boolean flag = true;
        try{
            session.update(userInfo);
            transaction.commit();
        }catch (Exception e){
            flag = false;
            e.printStackTrace();
        }finally {
            session.close();
        }
        return flag;
    }

    public boolean insertUserInfo(UserInfo userInfo){
        Session session = this.getSession();
        Transaction transaction = session.beginTransaction();
        boolean flag = true;
        try{
            session.save(userInfo);
            transaction.commit();
        }catch (Exception e){
            flag = false;
            e.printStackTrace();
        }finally {
            session.close();
        }
        return flag;
        //liuchengjin
        //1123456
    }
}
