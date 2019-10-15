package com.gpf.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Description: 文章实体类
 * @Auther: GuoPengfei
 * @Date: 2019/8/26 13:25
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@SuppressWarnings("serial")
public class Article {
    private int id;
    private String title;
    private String context;
    private String articleType;
    private String imageId;
}
