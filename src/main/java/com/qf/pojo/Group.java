package com.qf.pojo;

import java.util.Set;

/**
 * Created by DELL on 2019/8/15.
 */
public class Group {

    int groupId;
    String groupName;

    Set<UserInfo> userInfos;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Set<UserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(Set<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
//                ", userInfos=" + userInfos +
                '}';
    }
}
