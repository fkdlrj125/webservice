package himedia.fourth.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.transaction.annotation.Transactional;

import himedia.fourth.domain.Item;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class JdbcTemplateItemRepositoryTest {

	@Autowired JdbcTemplateItemRepository repository;
	
	@Test
	void save() {
//		given
		Item item = new Item("진라면",1000,100);
		
//		when
		Item result = repository.save(item);
		
//		then
		assertThat(result.getId()).isEqualTo(item.getId());
		
		log.info("item.getItemName() >> "+result.getItemName());
		log.info("item.getItemName() >> {}",result.getItemName());
	}
	
	@Test
	void findId() {
//		given
		Item item = new Item("신라면",1200,200);
		repository.save(item);
		
//		when
		Item result = repository.findById(item.getId()).get();
		
//		then
		assertThat(result.getId()).isEqualTo(item.getId());
	}
	
	@Test
	void findName() {
//		given
		Item item = new Item("삼양라면",1100,50);
		repository.save(item);
		
//		when
		Item result = repository.findByName(item.getItemName()).get();
		
//		then
		assertThat(result.getItemName()).isEqualTo(item.getItemName());
	}
	
	@Test
	void findAll() {
//		given
		int before = repository.findAll().size();
		Item item1 = new Item("불닭볶음면",1400,500);
		Item item2 = new Item("짜파게티", 1400, 400);
		repository.save(item1);
		repository.save(item2);
		
//		when
		List<Item> result = repository.findAll();
		
//		then
		assertThat(result.size()).isEqualTo(before+2);
	}
	
	@Test
	void update() {
//		given
		List<Item> list = repository.findAll();
		Long key = list.stream().findAny().get().getId();
		Item update = new Item("진짬뽕",1800,350);
		log.info("key >> {}",key);
		
//		when
		Item result = repository.update(key, update);
		log.info("result.getItemName() >> {}",result.getItemName());
		
//		then
		assertThat(result.getId()).isEqualTo(key);
	}
	
	@Test
	@Transactional
	void clearStore() {
		repository.clearStore();
		assertThat(repository.findAll()).isEmpty();
	}

}
