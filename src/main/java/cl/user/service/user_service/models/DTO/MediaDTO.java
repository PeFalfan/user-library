package cl.user.service.user_service.models.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MEDIA")
public class MediaDTO {

    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "CURRENTCHAPTERS")
    private int currentChapters;
    @Column(name = "TOTAL_CHAPTERS")
    private int totalChapters;
    @Column(name = "ORIGINAL_NAME")
    private String originalName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "RELEASE_YEAR")
    private int releaseYear;
    @Column(name = "MAIN_TAG_MAIN_TAG_ID")
    private int mainTag;

    public MediaDTO() {
    }

    public MediaDTO(Long id, String title, int currentChapters, int totalChapters, String originalName, String description, int releaseYear, int mainTag) {
        this.id = id;
        this.title = title;
        this.currentChapters = currentChapters;
        this.totalChapters = totalChapters;
        this.originalName = originalName;
        this.description = description;
        this.releaseYear = releaseYear;
        this.mainTag = mainTag;
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

    public int getCurrentChapters() {
        return currentChapters;
    }

    public void setCurrentChapters(int currentChapters) {
        this.currentChapters = currentChapters;
    }

    public int getTotalChapters() {
        return totalChapters;
    }

    public void setTotalChapters(int totalChapters) {
        this.totalChapters = totalChapters;
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

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getMainTag() {
        return mainTag;
    }

    public void setMainTag(int mainTag) {
        this.mainTag = mainTag;
    }
}
