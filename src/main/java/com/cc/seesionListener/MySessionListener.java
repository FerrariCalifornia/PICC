package com.cc.seesionListener;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

/**
 * Created by cc on 2017/3/30.
 */
public class MySessionListener implements SessionListener {
    @Override
    public void onStart(Session session) {
        System.out.println("会话创建：" + session.getId());

    }

    @Override
    public void onStop(Session session) {
        System.out.println("退出会话：" + session.getId());

    }

    @Override
    public void onExpiration(Session session) {
        System.out.println("会话过期：" + session.getId());

    }
}
