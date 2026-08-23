package ueers.dao;

import ueers.entuty.User;

public class UserDatabase {
    final static int MAX_USERS = 1000;
    private static final User[] users = new User[MAX_USERS];
    private static int  index = 0;
    public boolean save(User user)
    {
        //1.判断用户是否超过最大数量
        if(index>=MAX_USERS)
        {
            System.out.println("用户数量超过最大数量");
            return false;
        }
        users[index]=user;
        index++;
        user.setId(index);
        return true;
    }
    public User queryBYUsername(String username)
    {
        for(int i=0;i<index;i++)
        {
            if(users[i].getUsername()!=null && users[i].getUsername().equals(username))
            {
                return users[i];
            }
        }
        return null;
    }
}
