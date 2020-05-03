package com.ssm.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * UserController
 * @author lenovo
 * @version 1.0
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

//    @Autowired
//    private UserService userService;

    //  鏈堾ResponseBody浠son,string鏍煎紡杩斿洖;鏃燖ResponseBody浠ラ〉闈㈠舰寮忚繑鍥�
    @ResponseBody
    @RequestMapping(value = "login")
    public Map<String, Object> login(HttpServletRequest request, HttpSession httpSession, HttpServletResponse response) throws IOException {
        Map<String, Object> result = new HashMap();
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        Student user = new Student();
//        user.setUsername(username);
//        user.setPassword(password);
//        user = userService.login(user);
//        result.put("user", user);
//        httpSession.setAttribute("user", user);
//        if (userService.login(user) != null) {
//            result.put("success", true);
//            logger.info(result.toString());
//        } else {
//            result.put("success", false);
//            logger.error("鐧诲綍澶辫触");
//        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    public Map<String, Object> selectAll() {
        Map<String, Object> result = new HashMap();
//        List<Student> userList = userService.selectAll();
//        result.put("userList", userList);
//        if (userList != null) {
//            result.put("success", true);
//        } else {
//            result.put("success", false);
//        }
        return result;

    }

    @ResponseBody
    @RequestMapping(value = "/register")
    public Map<String, Object> register(HttpServletRequest request, HttpSession httpSession,
            HttpServletResponse response) throws Exception {
        Map<String, Object> result = new HashMap();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String name = request.getParameter("name");
//        String age = request.getParameter("age");
//        String sex = request.getParameter("sex");
//        String birthday = request.getParameter("birthday");
//        Student user = new Student();
//        user.setId(UUID.randomUUID().toString().replace("-", ""));
//        user.setUsername(username);
//        user.setPassword(password);
//        user.setName(name);
//        user.setAge(Integer.parseInt(age));
//        user.setSex(sex);
//        user.setBirthday(simpleDateFormat.parse(birthday));
//        logger.info(user.toString());
//
//        result.put("user", user);
//        int a = userService.addUser(user);
//        if (a == 1) {
//            logger.info("娉ㄥ唽鎴愬姛");
//            result.put("success", true);
//        } else {
//            logger.info("娉ㄥ唽澶辫触");
//            result.put("success", false);
//        }
        return result;
    }
}
