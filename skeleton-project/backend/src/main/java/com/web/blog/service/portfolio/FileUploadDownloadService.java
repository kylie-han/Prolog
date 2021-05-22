package com.web.blog.service.portfolio;

import javax.servlet.http.HttpServletRequest;

import com.web.blog.model.BasicResponse;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FileUploadDownloadService {

    /**
     * 파일 하나 업로드
     * @param pid
     * @param file
     * @return
     */
    public ResponseEntity<BasicResponse> storeFile(int pid, MultipartFile file);

    /**
     * 여러 파일 업로드
     * @param pid
     * @param files
     * @return
     */
    public ResponseEntity<BasicResponse> uploadMultipleFiles(int pid, MultipartFile[] files);
    /**
     * 파일 다운로드
     * @param fileName
     * @param request
     * @return
     */
    public ResponseEntity<Resource> downloadFile(String fileName, HttpServletRequest request);
    /**
     * 파일 삭제
     * @param id
     * @return
     */
    public ResponseEntity<BasicResponse> deleteFile(int id);

    /**
     * 압축파일 다운로드
     * @param request
     * @param uid
     * @param pid
     * @return
     */
    public ResponseEntity<Object> downloadPortfolio(HttpServletRequest request, String uid, int pid);

}