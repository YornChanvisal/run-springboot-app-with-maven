package com.foreal.test

import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class TestApplicationTests {

	@Autowired
	private val mvc: MockMvc? = null

	@Test
	@Throws(Exception::class)
	fun getHello() {
		mvc!!.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().string(equalTo("Emm, hi i guess. but, this is my homepage!")))
	}

	@Test
	@Throws(Exception::class)
	fun get() {
		mvc!!.perform(MockMvcRequestBuilders.get("/follow").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content().string(equalTo("Why are you following me here? TwT")))
	}

}
