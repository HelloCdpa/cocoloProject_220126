package com.phl.cocolo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointSaveDTO {
    private Long memberId;

    private int pointPoint;

    private String pointType;

}
