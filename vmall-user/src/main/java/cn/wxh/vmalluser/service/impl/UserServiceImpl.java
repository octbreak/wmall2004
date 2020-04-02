package cn.wxh.vmalluser.service.impl;

import cn.wxh.vmalluser.bean.UmsMember;
import cn.wxh.vmalluser.mapper.UserMapper;
import cn.wxh.vmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllMembers() {
        List<UmsMember> listMembers=userMapper.selectAll();
        return listMembers;
    }
}
