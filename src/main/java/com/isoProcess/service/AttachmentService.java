package com.isoProcess.service;

import java.util.List;
import com.isoProcess.entity.Attachment;

public interface AttachmentService {
    Attachment saveAttachment(Attachment attachment);
    Attachment getAttachmentById(int id);
    List<Attachment> getAllAttachments();
    Attachment updateAttachment(int id, Attachment attachment);
    void deleteAttachment(int id);
}