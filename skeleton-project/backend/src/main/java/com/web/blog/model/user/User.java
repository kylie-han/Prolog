// 하단 DB 설정 부분은 Sub PJT II에서 데이터베이스를 구성한 이후에 주석을 해제하여 사용.

package com.web.blog.model.user;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "user")
public class User {

    @Id
    // @OneToOne
    // @JoinColumn(name = "USER_ID")
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String uid;

    // @JsonIgnore
    private String password;
    // @JsonIgnore
    private String email;

    private String nickname;

    @Column(name = "picByte", length = 1000)
    private byte[] picByte;

    @Column(insertable = false, updatable = false)
    private LocalDateTime createDate;

    @Builder
    public User(String uid, String email, String password, String nickname, byte[] picByte) {
        this.uid = uid;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.picByte = picByte;
    }

    public byte[] getPicByte() {
        return picByte;
    }

    public void setPicByte(byte[] picByte) {
        this.picByte = picByte;
    }

}
