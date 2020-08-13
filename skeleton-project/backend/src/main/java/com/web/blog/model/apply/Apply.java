package com.web.blog.model.apply;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "apply")
public class Apply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int apid;

    @Column(name = "uid")
    private String uid;

    @Column(name = "ap_company")
    @NonNull
    private String apCompany;

    @Column(name = "ap_term")
    private String apTerm;

    @Column(name = "ap_desc")
    private String apDesc;

    @OneToMany(mappedBy = "apply")
    private List<ApplyPortfolio> applyPortfolio;

    @OneToMany(mappedBy = "apply")
    private List<ApplyExperience> applyExperience;

    @Builder
    public Apply(int apid, String uid, String apCompany, String apTerm, String apDesc) {
        this.apid = apid;
        this.uid = uid;
        this.apCompany = apCompany;
        this.apTerm = apTerm;
        this.apDesc = apDesc;
    }
}