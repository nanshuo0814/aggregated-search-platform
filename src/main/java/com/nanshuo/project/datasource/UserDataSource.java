package com.nanshuo.project.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nanshuo.project.model.dto.user.UserQueryRequest;
import com.nanshuo.project.model.vo.user.UserSafetyVO;
import com.nanshuo.project.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户服务实现
 */
@Service
@Slf4j
public class UserDataSource implements DataSource<UserSafetyVO> {

    @Resource
    private UserService userService;

    @Override
    public Page<UserSafetyVO> doSearch(String searchText, long pageNum, long pageSize) {
        UserQueryRequest userQueryRequest = new UserQueryRequest();
        userQueryRequest.setUserName(searchText);
        userQueryRequest.setCurrent(pageNum);
        userQueryRequest.setPageSize(pageSize);
        Page<UserSafetyVO> userVOPage = userService.listUserVOByPage(userQueryRequest);
        return userVOPage;
    }
}
