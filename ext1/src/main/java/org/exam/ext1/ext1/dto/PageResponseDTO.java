package org.exam.ext1.ext1.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
// @AllArgsConstructor
public class PageResponseDTO<E> {

    private List<E> list;
    private Long total;

    
    public PageResponseDTO(List<E> list, Long total) {

        this.list = list;
        this.total = total;

    }
}
