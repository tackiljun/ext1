package org.exam.ext1.ext1.mappers;

import java.util.List;

import org.exam.ext1.ext1.dto.BoardDTO;

public interface BoardMapper {

    List<BoardDTO> boardList();

    BoardDTO boardOne(Long bno);
    
}
