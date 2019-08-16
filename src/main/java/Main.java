import com.qf.dao.GroupInfoDao;
import com.qf.dao.UserInfoDao;
import com.qf.pojo.Group;
import com.qf.pojo.UserInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by DELL on 2019/8/15.
 */
public class Main {
    public static void main(String[] args) {
        UserInfoDao userInfoDao = new UserInfoDao();
        UserInfo userById = userInfoDao.getUserById(1);
        System.out.println(userById);
//        userById.setUsername("王涛123");
//        userById.setAccount("回首掏");
//        userInfoDao.updateUserInfo(userById);

//        System.out.println(userById);
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUsername("黄晶鑫");
//        userInfo.setPassword("123456");
//        userInfo.setAccount("想不到吧，我黄金荣又回来了");
//        userInfo.setEmail("huangjingxin@163.com");
//        userInfoDao.insertUserInfo(userInfo);

//        GroupInfoDao groupInfoDao = new GroupInfoDao();
//        Group groupById = groupInfoDao.getGroupById(1);
        //get load
        //get:即时获取
        //load:延时加载
//        System.out.println(groupById);
    }
}
