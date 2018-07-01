package me.junbin.crawler.service;

import me.junbin.crawler.domain.Photo;

import java.util.Collection;
import java.util.List;

/**
 * @author : Zhong Junbin
 * @email : <a href="mailto:rekadowney@gmail.com">发送邮件</a>
 * @createDate : 2018/7/1 22:58
 * @description :
 */
public interface PhotoService {

    void insert(Photo photo);

    void batchInsert(Collection<Photo> photos);

    void delete(Long id);

    void update(Photo photo);

    Photo findById(Long id);

    List<Photo> findByAlbumId(Long albumId);
}
