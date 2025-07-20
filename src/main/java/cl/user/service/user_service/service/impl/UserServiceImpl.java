package cl.user.service.user_service.service.impl;

import cl.user.service.user_service.models.DTO.FavoriteListDTO;
import cl.user.service.user_service.models.DTO.FavoriteMediaDTO;
import cl.user.service.user_service.models.DTO.MediaDTO;
import cl.user.service.user_service.models.FavoriteModel;
import cl.user.service.user_service.models.UserModel;
import cl.user.service.user_service.repository.FavoriteListRepository;
import cl.user.service.user_service.repository.FavoritesRepository;
import cl.user.service.user_service.repository.MediaRepository;
import cl.user.service.user_service.repository.UserRepository;
import cl.user.service.user_service.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final FavoritesRepository favoritesRepository;

    @Autowired
    private final MediaRepository mediaRepository;

    @Autowired
    private final FavoriteListRepository favoriteListRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public UserServiceImpl(
            UserRepository userRepository,
            FavoritesRepository favoritesRepository,
            MediaRepository mediaRepository,
            FavoriteListRepository favoriteListRepository) {
        this.userRepository = userRepository;
        this.favoritesRepository = favoritesRepository;
        this.mediaRepository = mediaRepository;
        this.favoriteListRepository = favoriteListRepository;
    }

    @Override
    public boolean validateOrCreateUser(String email) {

        try {
            if(userRepository.existsById(email)){
                return true;
            } else {
                UserModel userModel = new UserModel(email);
                userRepository.save(userModel);

                return userRepository.existsById(email);
            }
        } catch (Exception e) {
            logger.error("Error validating user", e);
            return false;
        }
    }

    @Override
    public List<FavoriteModel> getFavorites(String email) {
        try {

            List<FavoriteMediaDTO> favs = favoritesRepository.findByUserEmail(email);

            List<FavoriteModel> favoriteModels = new ArrayList<>();
            for(FavoriteMediaDTO fav : favs){
                favoriteModels.add(new FavoriteModel(fav.getMediaTitle(), fav.getMainTag()));
            }

            return favoriteModels;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean addToFavorites(String email, String title) {
        try {

            MediaDTO loadedMedia = mediaRepository.findByTitle(title);

            FavoriteListDTO favList = new FavoriteListDTO(email, loadedMedia.getId());

            favoriteListRepository.save(favList);

            return true;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean deleteFromFavorites(String email, String title) {
        try {

            FavoriteListDTO favList = new FavoriteListDTO(email, mediaRepository.findByTitle(title).getId());

            favoriteListRepository.delete(favList);

            return true;



        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
