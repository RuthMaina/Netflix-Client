package com.example.netflix;

import com.example.netflix.models.Categories;
import com.example.netflix.models.MovieDto;
import com.example.netflix.models.Movies;
import com.example.netflix.models.Users;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Component
public class ClientConnection implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public ClientConnection(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) {
        try {
//            feignRestClient.findAllUsers();

//            Users users = new Users("User", "user@gmail.com", false);
//            feignRestClient.createUser(users);

//            feignRestClient.deleteUser(15L, 15L);

//            feignRestClient.findAllCategories();

//            Categories categories = new Categories("horror");
//            feignRestClient.createCategories(categories);

//            feignRestClient.findCategoryById("Comedy");

//            feignRestClient.findAllMovies();

//            feignRestClient.findByCategoryAndType("Comedy","Suggested");

//            List<String> categories = Arrays.asList("si-fi", "Action");

            Categories categories1 = feignRestClient.findCategoryById("adventure");
            Categories categories2 = feignRestClient.findCategoryById("action");
            List<Categories> setCategories = new ArrayList<Categories>();
            setCategories.add(categories1);
            setCategories.add(categories2);
            Movies movies = new Movies("iron man", Year.of(2008), setCategories);
            feignRestClient.createMovies(22L, movies);

//            feignRestClient.deleteMovie(30L, 17L);

//            Categories categories1 = feignRestClient.findCategoryById("adventure");
//            Categories categories2 = feignRestClient.findCategoryById("action");
//            Categories categories3 = feignRestClient.findCategoryById("si-fi");
//            List<Categories> setCategories = new ArrayList<Categories>();
//            setCategories.add(categories1);
//            setCategories.add(categories2);
//            setCategories.add(categories3);
//            Movies movies = new Movies("source code", Year.of(2012), setCategories);
//            feignRestClient.updateMovie(32L, 17L, movies);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
