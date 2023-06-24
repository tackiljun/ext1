package org.exam.ext1.ext1.service;

import java.util.List;

import org.exam.ext1.ext1.dto.BoardDTO;
import org.exam.ext1.ext1.mappers.BoardMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl {

    private final BoardMapper boardMapper;

    
    public List<BoardDTO> boarList() {

        List<BoardDTO> list = boardMapper.boardList();

        return list;
    }


    
    public BoardDTO boardOne(Long bno) {

        BoardDTO boardOne = boardMapper.boardOne(bno);

        return boardOne;
    }

    
}
