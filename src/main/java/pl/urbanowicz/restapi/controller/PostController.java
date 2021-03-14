package pl.urbanowicz.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.urbanowicz.restapi.dto.PostDto;
import pl.urbanowicz.restapi.model.Post;
import pl.urbanowicz.restapi.service.PostService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<PostDto> getPosts() {
        return mapToDtos(postService.getPosts());
    }

    private List<PostDto> mapToDtos(List<Post> posts) {
        return posts.stream()
                .map(post -> mapToPostDto(post))
                .collect(Collectors.toList());
    }

    private PostDto mapToPostDto(Post post) {
        return PostDto.Builder.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .created(post.getCreated())
                .build();
    }

    @GetMapping("/posts/{id}")
    public Post getSinglePost(@PathVariable("id") long id) {
        return postService.getPostById(id);
    }
}
