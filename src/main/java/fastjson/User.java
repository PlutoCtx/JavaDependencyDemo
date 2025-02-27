package fastjson;

/**
 * JavaDependencyDemo
 * 用户 demo
 *
 * @author PlutoCtx
 * @version 2024/7/19 19:28
 * @email ctx195467@163.com
 * @since JDK17
 */

public class User {
    private String name;
    private int age;
    private String email;


    public User() {
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
