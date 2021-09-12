package top.mowangblog.code.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JavaStudy
 * 泛型综合练习
 *
 * @author : Xuan Li
 * @date : 2021-09-12 11:00
 **/
public class GenericExercise3 {
//    public static void main(String[] args) {
//        UserDao userDAO = new UserDao();
//        userDAO.save("1",new User(1,18,"lixuan"));
//        userDAO.save("2",new User(2,18,"mowang"));
//        System.out.println("userDAO.get(\"2\") = " + userDAO.get("2"));
//        userDAO.update("2",new User(2,18,"李煊"));
//        List<User> list = userDAO.list();
//        for (User user : list) {
//            System.out.println(user);
//        }
//        userDAO.delete("2");
//        list = userDAO.list();
//        for (User user : list) {
//            System.out.println(user);
//        }
//    }
    //使用junit测试
    @Test
    public void TestGeneric(){
        UserDao userDAO = new UserDao();
        userDAO.save("1",new User(1,18,"lixuan"));
        userDAO.save("2",new User(2,18,"mowang"));
        System.out.println("userDAO.get(\"2\") = " + userDAO.get("2"));
        userDAO.update("2",new User(2,18,"李煊"));
        List<User> list = userDAO.list();
        for (User user : list) {
            System.out.println(user);
        }
        userDAO.delete("2");
        System.out.println(userDAO.list());

    }
}
class UserDao extends DAO<User>{
    @Override
    public void delete(String id) {
        System.out.println("删除失败");
    }
}

class DAO<T> {
    private final Map<String,T> map = new HashMap<>();

    public void save(String id, T entity){
        map.put(id,entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        map.put(id,entity);
    }

    public List<T> list(){
        return new ArrayList<>(map.values());
//        return map.values().stream().collect(Collectors.toList());
    }

    public void delete(String id){
        map.remove(id);
    }
}


class User{
    private int id;
    private int age;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}

