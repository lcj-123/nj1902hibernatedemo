package com.qf.dao;

import com.qf.pojo.Group;

/**
 * Created by DELL on 2019/8/15.
 */
public class GroupInfoDao extends BaseDao{

    public Group getGroupById(int id){
        //get
        //load
        Group group = this.getSession().load(Group.class, id);
//        this.getSession().list(Group.class);
//        this.getSession().interator();
        return group;
    }
}
