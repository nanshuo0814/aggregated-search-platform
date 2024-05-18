package com.nanshuo.project.controller;

import com.nanshuo.project.common.ApiResponse;
import com.nanshuo.project.common.ApiResult;
import com.nanshuo.project.manager.SearchFacade;
import com.nanshuo.project.model.dto.search.SearchRequest;
import com.nanshuo.project.model.vo.SearchVO;
import com.nanshuo.project.service.PictureService;
import com.nanshuo.project.service.PostService;
import com.nanshuo.project.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片接口
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

    @Resource
    private UserService userService;

    @Resource
    private PostService postService;

    @Resource
    private PictureService pictureService;

    @Resource
    private SearchFacade searchFacade;

    @PostMapping("/all")
    public ApiResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
        return ApiResult.success(searchFacade.searchAll(searchRequest, request));
    }

}
