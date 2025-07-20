package cl.user.service.user_service.models.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "favorites_list")
public class FavoriteListDTO {


    @Column(name = "REGISTERED_USER_EMAIL")
    private String email;
    @Id
    @Column(name = "MEDIA_ID")
    private Long mediaId;

    public FavoriteListDTO() {
    }

    public FavoriteListDTO(String email, Long mediaId) {
        this.email = email;
        this.mediaId = mediaId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMediaId() {
        return mediaId;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }
}
