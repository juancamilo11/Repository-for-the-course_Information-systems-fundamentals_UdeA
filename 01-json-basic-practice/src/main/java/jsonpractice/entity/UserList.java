package jsonpractice.entity;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    private List<User> userList;

    public UserList() {
    }

    public UserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public User getUserById(int userId) {
         return userList.stream()
                 .filter((user)->user.getId() == userId)
                 .findFirst().orElse(new User());
    }

}
