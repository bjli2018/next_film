package service.impl;

import com.next.bob.springboot.example.dao.entity.NextUser;
import com.next.bob.springboot.example.dao.mapper.NextUserMapper;
import service.INextUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bob
 * @since 2019-11-01
 */
@Service
public class NextUserServiceImpl extends ServiceImpl<NextUserMapper, NextUser> implements INextUserService {

}
