package cl.user.service.user_service.repository;

import cl.user.service.user_service.models.DTO.FavoriteMediaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoritesRepository extends JpaRepository<FavoriteMediaDTO, String> {

    List<FavoriteMediaDTO> findByUserEmail(String email);
}
