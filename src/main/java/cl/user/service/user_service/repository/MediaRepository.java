package cl.user.service.user_service.repository;

import cl.user.service.user_service.models.DTO.MediaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepository extends JpaRepository<MediaDTO, String> {

    MediaDTO findByTitle(String title);
}
