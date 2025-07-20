package cl.user.service.user_service.repository;

import cl.user.service.user_service.models.DTO.FavoriteListDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteListRepository extends JpaRepository<FavoriteListDTO, String> {


}
