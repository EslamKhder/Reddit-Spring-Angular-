package com.springboot.reddit.repository;

import com.springboot.reddit.model.Post;
import com.springboot.reddit.model.User;
import com.springboot.reddit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    //Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}