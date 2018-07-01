package me.junbin.crawler.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author : Zhong Junbin
 * @email : <a href="mailto:rekadowney@gmail.com">发送邮件</a>
 * @createDate : 2018/6/30 22:54
 * @description :
 */
public class Album implements Serializable {

    private static final long serialVersionUID = 1L;
    // 主键ID
    private Long id;
    // 相册的标题
    private String title;
    // 相册的本地存储路径
    private String localPath;
    // 相册第一页的访问地址
    private String firstPageUrl;
    // 相册的所有图片地址
    private List<String> photos;

    public Album() {
        this.photos = new ArrayList<>();
    }

    public Album(String title) {
        this();
        this.title = title;
    }

    public Album(String title, String firstPageUrl) {
        this(title);
        this.firstPageUrl = firstPageUrl;
    }

    public Album(String title, String localPath, String firstPageUrl) {
        this.title = title;
        this.localPath = localPath;
        this.firstPageUrl = firstPageUrl;
    }

    public Album(String title, String firstPageUrl, List<String> photos) {
        this(title, firstPageUrl);
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", localPath='" + localPath + '\'' +
                ", firstPageUrl='" + firstPageUrl + '\'' +
                ", photos=" + photos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(id, album.id) &&
                Objects.equals(title, album.title) &&
                Objects.equals(localPath, album.localPath) &&
                Objects.equals(firstPageUrl, album.firstPageUrl) &&
                Objects.equals(photos, album.photos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, localPath, firstPageUrl, photos);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public String getFirstPageUrl() {
        return firstPageUrl;
    }

    public void setFirstPageUrl(String firstPageUrl) {
        this.firstPageUrl = firstPageUrl;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

}