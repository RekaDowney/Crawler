package me.junbin.crawler.repository;

import me.junbin.crawler.domain.Photo;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

/**
 * @author : Zhong Junbin
 * @email : <a href="mailto:rekadowney@gmail.com">发送邮件</a>
 * @createDate : 2018/6/30 22:55
 * @description :
 */
public interface PhotoRepo {

    int insert(Photo photo);

    int batchInsert(Collection<Photo> photos);

    int deleteById(@Param("id") Long id);

    int updateById(Photo photo);

    Photo findById(@Param("id") Long id);

    List<Photo> findByAlbumId(@Param("albumId") Long albumId);

}
