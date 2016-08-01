package com.premize.samples.web.jsf.prime.test;

import org.junit.Before;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.jdbc.JdbcTestUtils;

public abstract class AbstractDaoTest extends
		AbstractTransactionalJUnit4SpringContextTests {

	@Before
	public void setUp() throws Exception {
		Resource sqlTestData = super.applicationContext
				.getResource("classpath:META-INF/hibernate/sqlTestData.sql");
		JdbcTestUtils.executeSqlScript(super.jdbcTemplate,
				sqlTestData, false);
	}

}
