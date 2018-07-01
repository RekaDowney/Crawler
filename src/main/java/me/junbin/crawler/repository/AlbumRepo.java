package me.junbin.crawler.repository;

import me.junbin.crawler.domain.Album;
import org.apache.ibatis.annotations.Param;

/**
 * @author : Zhong Junbin
 * @email : <a href="mailto:rekadowney@gmail.com">发送邮件</a>
 * @createDate : 2018/6/30 22:55
 * @description :
 */
public interface AlbumRepo {

    int insert(Album album);

    int deleteById(@Param("id") Long id);

    int updateById(Album album);

    Album findById(@Param("id") Long id);

}
