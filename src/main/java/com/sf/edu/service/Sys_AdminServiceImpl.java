package com.sf.edu.service;

import com.sf.edu.entity.Sys_Admin;
import com.sf.edu.mapper.Sys_AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Sys_AdminServiceImpl implements Sys_AdminService {

    @Autowired
    private Sys_AdminMapper sys_adminMapper;

    @Override
    public Sys_Admin getSys_Admin(String acc,String pwd) {
        return sys_adminMapper.selectByAccPwd(acc,pwd);
    }
}
