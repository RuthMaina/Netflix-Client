package com.example.netflix;

import com.example.netflix.config.FeignConfig;
import com.example.netflix.models.Categories;
import com.example.netflix.models.MovieDto;
import com.example.netflix.models.Movies;
import com.example.netflix.models.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name="netflix-client", url="http://10.51.28.183:8088/api/v1/", configuration = FeignConfig.class)
public interface FeignRestClient {

    @RequestMapping(method = RequestMethod.GET, value = "users")
    List<Users> findAllUsers();

    @RequestMapping(method = RequestMethod.POST, value = "users")
    Users createUser(@RequestBody Users users);

    @RequestMapping(method = RequestMethod.DELETE, value = "users/delete/{id}")
    String deleteUser(@PathVariable Long id, @RequestParam Long userId);

    @RequestMapping(method = RequestMethod.GET, value = "categories")
    List<Categories> findAllCategories();

    @RequestMapping(method = RequestMethod.POST, value = "categories")
    Categories createCategories(@RequestBody Categories categories);

    @RequestMapping(method = RequestMethod.GET, value = "categories/{id}")
    Categories findCategoryById(@PathVariable String id);

    @RequestMapping(method = RequestMethod.GET, value = "movies")
    List<Movies> findAllMovies();

    @RequestMapping(method = RequestMethod.GET, value = "movies/{categoryId}")
    List<Movies> findByCategoryAndType(@PathVariable String categoryId, @RequestParam String type);

    @RequestMapping(method = RequestMethod.POST, value = "movies/{user}")
    Categories createMovies(@PathVariable long user, @RequestBody Movies movies);

    @RequestMapping(method = RequestMethod.DELETE, value = "movies/delete/{id}")
    public String deleteMovie(@PathVariable Long id, @RequestParam Long userId);

    @RequestMapping(method = RequestMethod.PUT, value = "movies/update/{id}")
    public Movies updateMovie(@PathVariable Long id, @RequestParam Long userId, @RequestBody Movies movies);
}
