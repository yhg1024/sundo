package org.sundo.list.controllers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;

import javax.persistence.Column;

@Data @Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestObservatory {

    private Long seq; // 연번

    private String mode = "write";

    @NotBlank
    private String obscd; // 관측소 코드

    private String obsnm; // 관측소명

    private String type; // 관측유형

    private String obinfo; // 관측 정보

    private String sbsncd; // 표준 유역 코드

    private String add; // 위치(주소)

    private String latitude; // 위도

    private String longitude; // 경도

    private String obsknd; // 관측방법

    private String mngorg; // 운영기관

    private Boolean useOutlier; //이상치 사용여부
    private Double outlier; // 이상치

    private Boolean clsyn; // 사용여부
}
