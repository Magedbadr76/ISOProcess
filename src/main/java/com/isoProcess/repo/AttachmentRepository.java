package com.isoProcess.repo;


import com.isoProcess.entity.Attachment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {

}
