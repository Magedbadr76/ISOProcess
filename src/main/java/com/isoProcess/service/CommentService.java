package com.isoProcess.service;

import com.isoProcess.entity.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    Comment saveComment(Comment comment);
    Optional<Comment> getCommentById(Integer id);
    List<Comment> getAllComments();
    void deleteCommentById(Integer id);
}