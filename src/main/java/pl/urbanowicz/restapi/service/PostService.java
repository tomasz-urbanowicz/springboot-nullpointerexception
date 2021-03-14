package pl.urbanowicz.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.urbanowicz.restapi.model.Post;
import pl.urbanowicz.restapi.repository.PostRepository;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPosts() {
        return postRepository.findAllByPosts(PageRequest.of(0, 5));
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id)
                .orElseThrow();
    }
}
