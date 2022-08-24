package com.spring.projetoblog.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.projetoblog.model.Post;
import com.spring.projetoblog.repository.ProjetoblogRepository;
import com.spring.projetoblog.service.ProjetoblogService;

@Service
public class ProjetoblogServiceImpl implements ProjetoblogService {

	@Autowired
	ProjetoblogRepository projetoblogRepository;

	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return projetoblogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		// TODO Auto-generated method stub
		return projetoblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		// TODO Auto-generated method stub
		return projetoblogRepository.save(post);
	}

}
