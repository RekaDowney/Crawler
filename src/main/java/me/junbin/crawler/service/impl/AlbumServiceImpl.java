package me.junbin.crawler.service.impl;

import me.junbin.crawler.domain.Album;
import me.junbin.crawler.repository.AlbumRepo;
import me.junbin.crawler.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Zhong Junbin
 * @email : <a href="mailto:rekadowney@gmail.com">发送邮件</a>
 * @createDate : 2018/7/1 22:56
 * @description :
 */
@Service("albumService")
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumRepo albumRepo;

    @Override
    public void insert(Album album) {
        albumRepo.insert(album);
    }

    @Override
    public void delete(Long id) {
        albumRepo.deleteById(id);
    }

    @Override
    public void update(Album album) {
        albumRepo.updateById(album);
    }

    @Override
    public Album findById(Long id) {
        return albumRepo.findById(id);
    }

}
