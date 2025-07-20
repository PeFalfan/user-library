package cl.user.service.user_service.models.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_favorite_series_view")
public class FavoriteMediaDTO {

    @Id
    @Column(name = "media_id") // debe tener un campo que puedas usar como @Id
    private Long mediaId;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "media_title")
    private String mediaTitle;

    @Column(name = "original_name")
    private String originalName;

    @Column(name = "description")
    private String description;

    @Column(name = "currentchapters")
    private Integer currentChapters;

    @Column(name = "total_chapters")
    private Integer totalChapters;

    @Column(name = "release_year")
    private Integer releaseYear;

    @Column(name = "main_tag")
    private String mainTag;

    public FavoriteMediaDTO() {
    }

    public FavoriteMediaDTO(Long mediaId, String userEmail, String mediaTitle, String originalName, String description, Integer currentChapters, Integer totalChapters, Integer releaseYear, String mainTag) {
        this.mediaId = mediaId;
        this.userEmail = userEmail;
        this.mediaTitle = mediaTitle;
        this.originalName = originalName;
        this.description = description;
        this.currentChapters = currentChapters;
        this.totalChapters = totalChapters;
        this.releaseYear = releaseYear;
        this.mainTag = mainTag;
    }

    public Long getMediaId() {
        return mediaId;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getMediaTitle() {
        return mediaTitle;
    }

    public void setMediaTitle(String mediaTitle) {
        this.mediaTitle = mediaTitle;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCurrentChapters() {
        return currentChapters;
    }

    public void setCurrentChapters(Integer currentChapters) {
        this.currentChapters = currentChapters;
    }

    public Integer getTotalChapters() {
        return totalChapters;
    }

    public void setTotalChapters(Integer totalChapters) {
        this.totalChapters = totalChapters;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getMainTag() {
        return mainTag;
    }

    public void setMainTag(String mainTag) {
        this.mainTag = mainTag;
    }
}
