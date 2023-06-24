package org.exam.ext1.ext1.controller;

import java.util.List;

import org.exam.ext1.ext1.dto.BoardDTO;
import org.exam.ext1.ext1.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/board/")
public class BoardController {

    private final BoardService boardService;


    @GetMapping("list")
    public void list(Model model) {

        List<BoardDTO> list = boardService.boardList();

        model.addAttribute("list", list);

        log.info("LIST!!!!!");
    }


    @GetMapping("read/{bno}")
    public String read(@PathVariable(value = "bno" , required = false ) Long bno, Model model) {

        BoardDTO boardOne = boardService.boardOne(bno);

        model.addAttribute("boardOne", boardOne);

        log.info("READ!!!!!");

        return "/board/read";
    }


    @GetMapping("add/{bno}")
    public String add(@PathVariable("bno") Long bno, Model model) {

        BoardDTO boardOne = boardService.boardOne(bno);

        model.addAttribute("boardOne", boardOne);

        log.info("ADD!!!!!");

        return "/board/add";
    }

    
    @GetMapping("modify/{bno}")
    public String modify(@PathVariable("bno") Long bno, Model model) {

        BoardDTO boardOne = boardService.boardOne(bno);

        model.addAttribute("boardOne", boardOne);

        log.info("MODIFY!!!!!");

        return "/board/modify";
    }
    
}
