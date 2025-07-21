package cl.user.service.user_service.service;

import cl.user.service.user_service.models.FavoriteModel;

import java.util.List;

public interface UserService {

    // method to validate users existence and create when necessary
    boolean validateOrCreateUser(String email);

    // method to load all favorites media
    List<FavoriteModel> getFavorites(String email);

    // Method to add to Favorite
    boolean addToFavorites(String email, String title);

    // method to delete from favorite media
    boolean deleteFromFavorites(String email, String title);

}
