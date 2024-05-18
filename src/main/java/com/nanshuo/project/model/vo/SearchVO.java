package com.nanshuo.project.model.vo;

import com.nanshuo.project.model.domain.Picture;
import com.nanshuo.project.model.vo.post.PostVO;
import com.nanshuo.project.model.vo.user.UserSafetyVO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 聚合搜索
 */
@Data
public class SearchVO implements Serializable {

    private List<UserSafetyVO> userList;

    private List<PostVO> postList;

    private List<Picture> pictureList;

    private List<?> dataList;

    private static final long serialVersionUID = 1L;

}
