package cpe200;

import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    private ArrayList<User> userList;

    public Users()
    {
        userList = new ArrayList<>();
    }


    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User user1 = new User(userName, password);
        userList.add(user1);
    }

    public void deleteUser(User user)
    {
        userList.remove(user);
    }

    public boolean exists(User user)
    {
        return  userList.contains(user);
    }

    public boolean usernameExists(String username)
    {
        for(User user: userList)
        {
            if(user.getUserName().equals(username))
            {
                return  true;
            }
        }
        return false;
    }

    public User getUserByUsername(String userName)
    {
        for(User user: userList)
        {
            if(user.getUserName().equals(userName))
            {
                return user;
            }

        }
        return  null;
    }

    public int count()
    {
        return  userList.size();
    }

    public User[] getUserArray()
    {
       return userList.toArray(new User[count()]);
    }
}
