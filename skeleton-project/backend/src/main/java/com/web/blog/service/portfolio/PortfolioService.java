package com.web.blog.service.portfolio;

import com.web.blog.model.BasicResponse;
import com.web.blog.model.portfolio.PTagCreateRequest;
import com.web.blog.model.portfolio.PortfolioRequest;
import com.web.blog.model.portfolio.PortfolioUpdateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface PortfolioService {

    /**
     * 유저의 모든 포트폴리오 리턴
     * @param uid
     * @return
     */
    ResponseEntity<BasicResponse> readAll(String uid);
    /**
     * 유저의 모든 포트폴리오의 모든 태그 리턴
     * @param uid
     * @return
     */
    ResponseEntity<BasicResponse> getTagAll(String uid);
    /**
     * 포트폴리오 생성
     * @param request
     * @return
     */
    ResponseEntity<BasicResponse> createPortfolio(PortfolioRequest request);
    /**
     * 포트폴리오 수정
     * @param request
     * @return
     */
    ResponseEntity<BasicResponse> updatePortfolio(PortfolioUpdateRequest request);
    /**
     * 포트폴리오 삭제
     * @param pid
     * @return
     */
    ResponseEntity<BasicResponse> deletePortfolio(int pid);
    /**
     * 포트폴리오 하나 리턴
     * @param pid
     * @return
     */
    ResponseEntity<BasicResponse> readOne(int pid);
    /**
     * 포트폴리오 태그 생성, 연결
     * @param pid
     * @param tag
     * @return
     */
    ResponseEntity<BasicResponse> createPTag(int pid, String tag);
    /**
     * 포트폴리오 태그 연결해제
     * @param request
     * @return
     */
    ResponseEntity<BasicResponse> deletePtag(PTagCreateRequest request);
}
