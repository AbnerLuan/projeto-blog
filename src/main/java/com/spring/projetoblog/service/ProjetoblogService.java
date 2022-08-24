package com.spring.projetoblog.service;

import java.util.List;

import com.spring.projetoblog.model.Post;

public interface ProjetoblogService {

	List<Post> findAll();

	Post findById(long id);

	Post save(Post post);

}
