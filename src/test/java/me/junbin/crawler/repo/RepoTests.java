package me.junbin.crawler.repo;

import me.junbin.crawler.domain.Album;
import me.junbin.crawler.domain.Photo;
import me.junbin.crawler.repository.AlbumRepo;
import me.junbin.crawler.repository.PhotoRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : Zhong Junbin
 * @email : <a href="mailto:rekadowney@gmail.com">发送邮件</a>
 * @createDate : 2018/6/30 23:09
 * @description :
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RepoTests {

    @Autowired
    private AlbumRepo albumRepo;
    @Autowired
    private PhotoRepo photoRepo;

    @Test
    public void test01() throws Exception {
        Album album = new Album("测试", "https://google.com/page/1/0");
        albumRepo.insert(album);

        String urlPattern = "https://google.com/page/1/%d";
        for (int i = 0; i < 10; i++) {
            Photo photo = new Photo(String.format(urlPattern, i), i, album.getId());
            photoRepo.insert(photo);
        }

        assert albumRepo.findById(1L).equals(album);
        assert photoRepo.findByAlbumId(1L).size() == 10;
    }

}
