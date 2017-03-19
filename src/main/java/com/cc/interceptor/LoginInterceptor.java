package com.cc.interceptor;


import com.cc.pojo.UserInfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by cc on 2017/3/19.
 */

public class LoginInterceptor implements HandlerInterceptor {
    private static final String[] innore_url= {"/test","/pages/index2.html"};
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String servletPath = request.getServletPath();
        boolean flag = true;
        for (String s:innore_url
             ) {
            if(servletPath.contains(s)){
                System.out.println(s);
                flag = true;
                break;
            }
        }
//        Object user = request.getSession().getAttribute();

//        if (!flag){
//            UserInfo userInfo = (UserInfo)request.getSession().getAttribute("user");
//            if (userInfo == null){
//                System.out.println("qing xian deng lu");
//                response.sendRedirect("/index.html");
//                request.setAttribute("message","qing xian denglu");
//            }else {
//                System.out.println("yan zheng cheng gong");
//                flag =true;
//            }
//        }

        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        System.out.println("afterCompletion");
    }

}
