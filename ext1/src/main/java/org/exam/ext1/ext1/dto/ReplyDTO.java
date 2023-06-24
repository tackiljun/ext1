package org.exam.ext1.ext1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {

    private Long rno;
    private Long bno;
    private Long gno;  
    private String reply; 
    private String replyer; 
    private String dueDate;
    
}
