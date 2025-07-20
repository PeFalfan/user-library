package cl.user.service.user_service.controllers;

import cl.user.service.user_service.models.FavoriteModel;
import cl.user.service.user_service.models.FavoritePostRequest;
import cl.user.service.user_service.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/validateUser")
    public boolean validateUser(@RequestBody String email){
        return userService.validateOrCreateUser(email);
    }

    @GetMapping("/getFavorites")
    public List<FavoriteModel> getFavorites(
            @RequestBody String email
    ){
        return userService.getFavorites(email);
    }

    @PostMapping("/addToFavorites")
    public boolean addToFavorites(@RequestBody FavoritePostRequest favoriteModel){

        return userService.addToFavorites(favoriteModel.getEmail(), favoriteModel.getTitle());
    }

    @DeleteMapping("/deleteFavorite")
    public boolean deleteFavorite(@RequestBody FavoritePostRequest favoriteModel){
        return userService.deleteFromFavorites(favoriteModel.getEmail(), favoriteModel.getTitle());
    }



}
