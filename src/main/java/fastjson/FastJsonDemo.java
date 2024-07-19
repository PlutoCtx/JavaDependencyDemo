package fastjson;

import com.alibaba.fastjson2.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaDependencyDemo
 * FastJSON使用
 *
 * @author PlutoCtx
 * @version 2024/7/19 20:01
 * @email ctx195467@163.com
 * @since JDK17
 */

public class FastJsonDemo {

    private static List<User> userList = new ArrayList<>();

    public static void init() {
        userList.add(new User("张三", 18, "email1@163.com"));
        userList.add(new User("张四", 19, "email2@163.com"));
        userList.add(new User("张五", 20, "email3@163.com"));
        userList.add(new User("张六", 21, "email4@163.com"));
    }

    public static void main(String[] args) {
        init();
        String output = JSON.toJSONString(userList);
        System.out.println(output);
    }

}
