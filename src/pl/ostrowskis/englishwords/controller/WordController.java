package pl.ostrowskis.englishwords.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.ostrowskis.englishwords.dao.WordDAO;
import pl.ostrowskis.englishwords.entity.Word;

@Controller
@RequestMapping("/word")
public class WordController {

	@Autowired
	private WordDAO wordDAO;
	
	@RequestMapping("/list")
	public String listWords(Model theModel) {
		
		List<Word> theWords = wordDAO.getWords();
		
		
		theModel.addAttribute("words", theWords);
		
		return "list-words";
	}
}
