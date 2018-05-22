package pl.ostrowskis.englishwords.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.ostrowskis.englishwords.dao.WordDAO;
import pl.ostrowskis.englishwords.entity.Word;
import pl.ostrowskis.englishwords.service.WordService;

@Controller
@RequestMapping("/word")
public class WordController {

	@Autowired
	private WordService wordService;
	
	@GetMapping("/list")
	public String listWords(Model theModel) {
		
		List<Word> theWords = wordService.getWords();
		
		
		theModel.addAttribute("words", theWords);
		
		return "list-words";
	}
}
