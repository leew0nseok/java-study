package com.example.objectmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("-----------");

		// Text JSON -> Object
		// Object -> Text JSON

		// controller req json(text) -> object
		// respone object -> json(text)

		var objectMapper = new ObjectMapper();

		// object -> text
		// object mapper get method �� Ȱ���Ѵ�.
		var user = new User("steve", 10, "010-1111-2222");

		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		// text -> object
		// object mapper �� default �����ڸ� �ʿ�� �Ѵ�.
		var objectUser = objectMapper.readValue(text, com.example.objectmapper.User.class);
		System.out.println(objectUser);


	}

}
