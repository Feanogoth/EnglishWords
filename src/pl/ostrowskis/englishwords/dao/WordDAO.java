package pl.ostrowskis.englishwords.dao;

import java.util.List;

import pl.ostrowskis.englishwords.entity.Word;

public interface WordDAO {

	public List<Word> getWords();
}
