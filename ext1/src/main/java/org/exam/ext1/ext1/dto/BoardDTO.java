package org.exam.ext1.ext1.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    private Long bno;
    private String title;
    private String writer;
    private String content;
    private LocalDate duedate;
    private Long gno;
    
}
