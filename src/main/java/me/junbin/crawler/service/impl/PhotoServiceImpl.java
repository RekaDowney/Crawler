package me.junbin.crawler.service.impl;

import me.junbin.crawler.domain.Photo;
import me.junbin.crawler.repository.PhotoRepo;
import me.junbin.crawler.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * @author : Zhong Junbin
 * @email : <a href="mailto:rekadowney@gmail.com">发送邮件</a>
 * @createDate : 2018/7/1 22:59
 * @description :
 */
@Service("photoService")
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoRepo photoRepo;

    @Override
    public void insert(Photo photo) {
        photoRepo.insert(photo);
    }

    @Override
    public void batchInsert(Collection<Photo> photos) {
        photoRepo.batchInsert(photos);
    }

    @Override
    public void delete(Long id) {
        photoRepo.deleteById(id);
    }

    @Override
    public void update(Photo photo) {
        photoRepo.updateById(photo);
    }

    @Override
    public Photo findById(Long id) {
        return photoRepo.findById(id);
    }

    @Override
    public List<Photo> findByAlbumId(Long albumId) {
        return photoRepo.findByAlbumId(albumId);
    }

}
