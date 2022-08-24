package com.spring.projetoblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.projetoblog.model.Post;

public interface ProjetoblogRepository extends JpaRepository<Post, Long> {

}
