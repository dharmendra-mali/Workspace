package com.tavant.scrum_board.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tavant.scrum_board.models.User;
import com.tavant.scrum_board.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = UserRestController.class, secure = false)
public class UserRestControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserService userService;

	@Test
	public void testGetUser() throws Exception {

		User user = new User("PT0832", "dev", "kumar", "dev@gmail.com", "123", "project treni", "arnun");
		String expectedJson = this.mapToJson(user);
		String url = "/user_api/user/PT0832";
		Mockito.when(userService.getUser(Mockito.anyString())).thenReturn(user);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(url).accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		String outputInJson = result.getResponse().getContentAsString();

		JSONAssert.assertEquals(expectedJson, outputInJson, false);

	}

	@Test
	public void testUserList() throws Exception {

		User tempUser1 = new User("PT0832", "dev", "kumar", "dev@gmail.com", "123", "project treni", "arnun");
		User tempUser2 = new User("PT0834", "vikram", "kumar", "vk@gmail.com", "123", "project treni", "arnun");
		List<User> list = new ArrayList<User>();
		list.add(tempUser1);
		list.add(tempUser2);

		String expectedJson = this.mapToJson(list);

		String url = "/user_api/user";
		Mockito.when(userService.userList()).thenReturn(list);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(url).accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		String outputInJson = result.getResponse().getContentAsString();
		JSONAssert.assertEquals(expectedJson, outputInJson, false);

	}

	private String mapToJson(Object object) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(object);

	}

	/*
	 * @Test public void testCreateUser() throws Exception {
	 * 
	 * User tempUser1 = new User("PT0832", "dev", "kumar", "dev@gmail.com",
	 * "123", "project treni", "arnun");
	 * 
	 * String url = "/user_api/save"; String expectedJson =
	 * this.mapToJson(tempUser1); //
	 * Mockito.when(userService.createUser((Mockito.any(User.class))).thenReturn
	 * (tempUser1); RequestBuilder requestBuilder =
	 * MockMvcRequestBuilders.post(url).accept(MediaType.APPLICATION_JSON);
	 * 
	 * MvcResult result = mockMvc.perform(requestBuilder).andReturn(); String
	 * outputInJson = result.getResponse().getContentAsString();
	 * JSONAssert.assertEquals(expectedJson, outputInJson, false);
	 * 
	 * }
	 */
}
