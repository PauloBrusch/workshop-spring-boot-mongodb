package com.paulobrusch.workshopmongo.services;

import com.paulobrusch.workshopmongo.domain.Post;
import com.paulobrusch.workshopmongo.repository.PostRepository;
import com.paulobrusch.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}

