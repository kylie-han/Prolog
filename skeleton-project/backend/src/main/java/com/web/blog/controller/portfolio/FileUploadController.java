package com.web.blog.controller.portfolio;

import javax.servlet.http.HttpServletRequest;

import com.web.blog.model.BasicResponse;
import com.web.blog.service.portfolio.FileUploadDownloadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
public class FileUploadController {

    @Autowired
    private FileUploadDownloadService service;

    @PostMapping("/uploadFile/{pid}")
    @ApiOperation(value = "폼태그의 파일 업로드 방식으로 파일을 업로드 할 수 있다.")
    public ResponseEntity<BasicResponse> uploadFile(@PathVariable int pid, @RequestParam("file") MultipartFile file) {

        return service.storeFile(pid, file);
    }

    @PostMapping("/uploadMultipleFiles")
    @ApiOperation(value = "파일들의 배열(list)로 여러 파일을 업로드 할 수 있다.")
    public ResponseEntity<BasicResponse> uploadMultipleFiles(@RequestParam int pid,
            @RequestParam("file") MultipartFile[] file) { // service에선 file->files
        return service.uploadMultipleFiles(pid, file);
    }

    @GetMapping("/downloadFile/{fileName}")
    @ApiOperation(value = "파일 개별 다운로드 - 파일 이름으로 파일을 다운로드 할 수 있다.")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        return service.downloadFile(fileName, request);
    }

    @GetMapping("/downloadPortfolio")
    @ApiOperation(value = "포트폴리오에 속해있는 파일을 압축파일로 받을 수 있다.")
    public ResponseEntity<Object> downloadPortfolio(HttpServletRequest request, String uid, int pid) {
        return service.downloadPortfolio(request, uid, pid);
    }

    @DeleteMapping("/deleteFile/{id}")
    @ApiOperation(value = "특정 파일을 db와 파일 스토리지에서 삭제한다.")
    public ResponseEntity<BasicResponse> deleteFile(@PathVariable int id) {

        return service.deleteFile(id);
    }
}