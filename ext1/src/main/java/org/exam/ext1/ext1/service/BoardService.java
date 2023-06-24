package org.exam.ext1.ext1.service;

import java.util.List;

import org.exam.ext1.ext1.dto.BoardDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BoardService {

    List<BoardDTO> boardList();

    BoardDTO boardOne(Long bno);
    
}
