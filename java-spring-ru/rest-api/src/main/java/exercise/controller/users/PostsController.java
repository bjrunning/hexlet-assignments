package exercise.controller.users;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import exercise.model.Post;
import exercise.Data;

// BEGIN
@RestController
@RequestMapping("/api")
public class PostsController {
    private final List<Post> posts = Data.getPosts();

    @GetMapping("/posts") // Список страниц
    public List<Post> index(@RequestParam(defaultValue = "10") Integer limit) {
        return posts.stream().limit(limit).toList();
    }

    @PostMapping("/users/{id}/posts")
    @ResponseStatus(HttpStatus.CREATED)
    public Post create(@PathVariable int id, @RequestBody Post post) {
        post.setUserId(id);
        posts.add(post);
        return post;
    }

    @GetMapping("/users/{id}/posts")
    public List<Post> show(@PathVariable String id) {
        int userId = Integer.parseInt(id);
        System.out.println("TEST!");
        System.out.println(userId);
        Stream<Post> postStream = posts.stream();

        if (userId > 0) {
            postStream = postStream.filter(post -> post.getUserId() == userId);
        }

        return postStream.collect(Collectors.toList());
    }
}
// END
