package com.scienjus.domain;

import com.scienjus.mrc.annotation.Counter;
import com.scienjus.mrc.annotation.Field;
import com.scienjus.mrc.annotation.Id;
import lombok.Data;

/**
 * @author xieenlong
 * @date 16/2/7.
 */
@Counter(name = "Post")
@Data
public class Post {

    @Id
    private String id;

    private String title;

    @Field(name = "views")
    private long viewCount;

    public int incrViewCount() {
        return 0;
    }

    public int decrViewCount() {
        return 0;
    }
}