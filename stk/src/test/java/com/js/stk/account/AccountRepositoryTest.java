package com.js.stk.account;


import static org.assertj.core.api.Assertions.assertThat;

import java.sql.SQLException;
import java.util.Optional;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountRepositoryTest {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	AccountRepository accountRepository;
	
	@Test
	public void di() throws SQLException {
		Account account = new Account();
		
		account.setUserName("js");
		account.setPassword("pass");
		
		Account newAccount = accountRepository.save(account);
		
		assertThat(newAccount).isNotNull();
		
		Optional<Account> existingAccount = accountRepository.findByUserName(newAccount.getUserName());
		assertThat(existingAccount).isNotEmpty();
		
		Optional<Account> nonExistingAccount = accountRepository.findByUserName("kim");
		assertThat(nonExistingAccount).isEmpty();
	}
}
