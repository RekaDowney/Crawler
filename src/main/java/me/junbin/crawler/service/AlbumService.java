package me.junbin.crawler.service;

import me.junbin.crawler.domain.Album;

/**
 * @author : Zhong Junbin
 * @email : <a href="mailto:rekadowney@gmail.com">发送邮件</a>
 * @createDate : 2018/7/1 22:54
 * @description :
 */
public interface AlbumService {

    void insert(Album album);

    void delete(Long id);

    void update(Album album);

    Album findById(Long id);

}
