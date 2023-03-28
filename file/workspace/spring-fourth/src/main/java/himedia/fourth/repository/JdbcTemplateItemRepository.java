package himedia.fourth.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import himedia.fourth.domain.Item;
import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class JdbcTemplateItemRepository implements ItemRepository {
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplateItemRepository(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public RowMapper<Item> rowMapper() { 
		return (rs, rowNum) -> {
			Item item = new Item(rs.getString("itemName"), rs.getInt("price"),rs.getInt("quantity"));
			item.setId(rs.getLong("id"));
			return item;
		};
	}

	@Override
	public Item save(Item item) {
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate)
					.withTableName("item")
					.usingGeneratedKeyColumns("id");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("itemName", item.getItemName());
		map.put("price", item.getPrice());
		map.put("quantity", item.getQuantity());
		
		Number key = insert.executeAndReturnKey(new MapSqlParameterSource(map));
		item.setId(key.longValue());
		return item;
	}

	@Override
	public Optional<Item> findById(Long id) {
		 List<Item> list = jdbcTemplate.query("select * from item where id = ?", rowMapper(), id);
		 return list.stream().findAny();
	}
	
	@Override
	public Optional<Item> findByName(String name) {
		List<Item> list = jdbcTemplate.query("select * from item where itemname like concat('%',?,'%')", rowMapper(), name);
		return list.stream().findAny();
	}

	@Override
	public List<Item> findAll() {
		return jdbcTemplate.query("select * from item", rowMapper());
	}

	@Override
	public Item update(Long itemId, Item updateItem) {
		log.info("update() 실행됨 >> {}"+itemId);
//		테이블의 raw를 변경하는 모든 작업을 update메소드로 실행
		jdbcTemplate.update("update item set itemname=?, price=?, quantity=? where id=?"
				, updateItem.getItemName(), updateItem.getPrice(), updateItem.getQuantity(),itemId);
		return findById(itemId).get();
	}

	@Override
	public void clearStore() {
		jdbcTemplate.update("delete from item");
	}
	
}
