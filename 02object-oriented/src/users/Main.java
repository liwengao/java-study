package users;

import users.dao.UserDatabase;
import users.entuty.User;

public class Main {
    static void main(String[] args) {
        System.out.println("程序已启动");

        UserDatabase userDB = new UserDatabase();
//        User user1 = new User("admin", "111");
        //匿名对象
        userDB.save(new User("admin", "111"));
        User user =userDB.queryBYUsername("admin");
        if(user==null)
        {
            System.out.println("用户不存在");
            return;
        }
        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
    }
}
