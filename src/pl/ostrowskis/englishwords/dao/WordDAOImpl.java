package pl.ostrowskis.englishwords.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pl.ostrowskis.englishwords.entity.Word;

@Repository
public class WordDAOImpl implements WordDAO {

	@Autowired
	private SessionFactory sessionFactory; 
	
	
	@Override
	@Transactional
	public List<Word> getWords() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Word> theQuery = currentSession.createQuery("from Word order by english", Word.class);
		
		List<Word> words = theQuery.getResultList();
		
		return words;
	}

}
