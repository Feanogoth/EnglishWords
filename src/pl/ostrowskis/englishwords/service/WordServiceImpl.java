package pl.ostrowskis.englishwords.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.ostrowskis.englishwords.dao.WordDAO;
import pl.ostrowskis.englishwords.entity.Word;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	private WordDAO wordDAO;
	
	@Override
	@Transactional
	public List<Word> getWords() {
		return wordDAO.getWords();
	}

}
