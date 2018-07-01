package me.junbin.crawler.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author : Zhong Junbin
 * @email : <a href="mailto:rekadowney@gmail.com">发送邮件</a>
 * @createDate : 2018/6/30 22:56
 * @description :
 */
public class Photo implements Serializable {

    private static final long serialVersionUID = 1L;
    // 主键
    private Long id;
    // 相片的访问地址
    private String url;
    // 相片在图集中的顺序，第N+1张图片，0表示第1张图片
    private Integer ordinal;
    // 相片的本地存储路径
    private String localPath;
    // 相片归属的图集，关联到ALBUM#ID
    private Long albumId;

    public Photo() {
    }

    public Photo(String url, Integer ordinal) {
        this.url = url;
        this.ordinal = ordinal;
    }

    public Photo(String url, Integer ordinal, String localPath) {
        this.url = url;
        this.ordinal = ordinal;
        this.localPath = localPath;
    }

    public Photo(String url, Integer ordinal, Long albumId) {
        this.url = url;
        this.ordinal = ordinal;
        this.albumId = albumId;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", ordinal=" + ordinal +
                ", localPath='" + localPath + '\'' +
                ", albumId=" + albumId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return Objects.equals(id, photo.id) &&
                Objects.equals(url, photo.url) &&
                Objects.equals(ordinal, photo.ordinal) &&
                Objects.equals(localPath, photo.localPath) &&
                Objects.equals(albumId, photo.albumId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, ordinal, localPath, albumId);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

}