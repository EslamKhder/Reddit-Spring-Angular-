package com.springboot.reddit.repository;

import com.springboot.reddit.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    //List<Comment> findByPost(Post post);

    //List<Comment> findAllByUser(User user);
}
