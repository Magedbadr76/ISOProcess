package com.isoProcess.service.impl;

import java.util.List;
import java.util.Optional;
import com.isoProcess.entity.Attachment;
import com.isoProcess.repo.AttachmentRepository;
import com.isoProcess.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttachmentServiceImpl implements AttachmentService {

	@Autowired
	private AttachmentRepository attachmentRepository;

	@Override
	public Attachment saveAttachment(Attachment attachment) {
		return attachmentRepository.save(attachment);
	}

	@Override
	public Attachment getAttachmentById(int id) {
		Optional<Attachment> attachment = attachmentRepository.findById(id);
		return attachment.orElse(null);
	}

	@Override
	public List<Attachment> getAllAttachments() {
		return attachmentRepository.findAll();
	}

	@Override
	public Attachment updateAttachment(int id, Attachment attachment) {
		Optional<Attachment> existingAttachment = attachmentRepository.findById(id);
		if (existingAttachment.isPresent()) {
			Attachment updatedAttachment = existingAttachment.get();
			updatedAttachment.setTICKET_ID(attachment.getTICKET_ID());
			updatedAttachment.setATTACHMENT_NAME(attachment.getATTACHMENT_NAME());
			updatedAttachment.setATTACHMENT_LOCATION(attachment.getATTACHMENT_LOCATION());
			return attachmentRepository.save(updatedAttachment);
		} else {
			return null;
		}
	}

	@Override
	public void deleteAttachment(int id) {
		attachmentRepository.deleteById(id);
	}

}
