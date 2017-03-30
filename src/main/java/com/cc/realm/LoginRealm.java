package com.cc.realm;

import com.cc.pojo.UserInfo;
import com.cc.pojo.UserRole;
import com.cc.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by cc on 2017/3/2.
 */
@Component
public class LoginRealm extends AuthorizingRealm {

    @Resource
    private LoginService loginService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        /**
         * 获取身份信息，我们可以在这个方法中，从数据库获取该用户的权限和角色信息
         */
        String username = (String) getAvailablePrincipal(principalCollection);
        System.out.println("查询用户"+username+"角色中.....");

        //我们可以通过用户名从数据库获取权限/角色信息
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //权限
//        Set<String> s = new HashSet<String>();
//        s.add("printer:print");
//        s.add("p1");
//        s.add("p2");
//        info.setStringPermissions(s);
        //角色
        Set<String> r = new HashSet<String>();
        r.add(loginService.findUserType(username));
        info.setRoles(r);

        System.out.println("该用户角色为："+info.getRoles());
//        System.out.println("find prermission info in database "+info.getStringPermissions());
        return info;
    }
    /**
     * 在这个方法中，进行身份验证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取用户账号
        System.out.println("验证密码中。。。。。 ");
        String username = token.getPrincipal().toString() ;
        UserInfo user = loginService.findUserByUsername(username) ;
        if (user != null){
            //将查询到的用户账号和密码存放到 authenticationInfo用于后面的权限判断。第三个参数随便放一个就行了。
            AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),
                    this.getName()) ;
//            System.out.println("authentication info "+authenticationInfo);
            //手动调用dogetAuthorizationinfo方法获取用户身份和权限，因为后面的
            // return authentication info为空，所以迫不得已手动调用，正常情况应该自动调用；
//            doGetAuthorizationInfo(SecurityUtils.getSubject().getPrincipals());

            return authenticationInfo ;
        }else{
            return  null ;
        }
    }
}
