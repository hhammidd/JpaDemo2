package com.hamid.repository;

import com.hamid.entitis.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment , Integer> {

}
