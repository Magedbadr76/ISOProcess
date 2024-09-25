package com.isoProcess.controller;

import com.isoProcess.entity.Attachment;
import com.isoProcess.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attachments")
public class AttachmentController {

    @Autowired
    private AttachmentService attachmentService;

    // Create a new attachment
    @PostMapping
    public ResponseEntity<Attachment> createAttachment(@RequestBody Attachment attachment) {
        Attachment savedAttachment = attachmentService.saveAttachment(attachment);
        return new ResponseEntity<>(savedAttachment, HttpStatus.CREATED);
    }

    // Get an attachment by ID
    @GetMapping("/{id}")
    public ResponseEntity<Attachment> getAttachmentById(@PathVariable int id) {
        Attachment attachment = attachmentService.getAttachmentById(id);
        if (attachment != null) {
            return new ResponseEntity<>(attachment, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Get all attachments
    @GetMapping
    public ResponseEntity<List<Attachment>> getAllAttachments() {
        List<Attachment> attachments = attachmentService.getAllAttachments();
        return new ResponseEntity<>(attachments, HttpStatus.OK);
    }

    // Update an attachment
    @PutMapping("/{id}")
    public ResponseEntity<Attachment> updateAttachment(@PathVariable int id, @RequestBody Attachment attachment) {
        Attachment updatedAttachment = attachmentService.updateAttachment(id, attachment);
        if (updatedAttachment != null) {
            return new ResponseEntity<>(updatedAttachment, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete an attachment
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAttachment(@PathVariable int id) {
        attachmentService.deleteAttachment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}