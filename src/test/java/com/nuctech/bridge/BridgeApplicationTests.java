package com.nuctech.bridge;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nuctech.bridge.entity.Goods;
import com.nuctech.bridge.entity.UserOperation;
import com.nuctech.bridge.util.JsonUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BridgeApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testJson() {
		
		
		String jsonString = "{\"id\":\"1\", \"userId\":\"1\", \"modeType\":\"goods\", \"resultId\":\"2\", \"isaccept\":\"1\"}";
//		String json2 = "{\"id\":\"1\", \"label\":\"sss\", \"description\":\"goods\", \"image\":\"2\", \"score\":\"1\"}";
//		String json3= "{\"id\":\"1\", \"label\":\"sss\"}";
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			
//			Goods g = mapper.readValue(json3, Goods.class);
			
			UserOperation uo = mapper.readValue(jsonString, UserOperation.class);
			
			
			System.out.println("-----------------");
			System.out.println(JsonUtil.ObjectToJson(uo));
			
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
