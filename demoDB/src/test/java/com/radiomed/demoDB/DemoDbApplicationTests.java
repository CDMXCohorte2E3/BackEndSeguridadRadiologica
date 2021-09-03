package com.radiomed.demoDB;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.radiomed.demoDB.usuarios.Usuarios;
import com.radiomed.demoDB.usuarios.UsuariosController;
import com.radiomed.demoDB.usuarios.UsuariosService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureMockMvc
class DemoDbApplicationTests {


	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	} //contextLoads

	@Test
	public void pruebaAdminGet() throws Exception {
		this.mockMvc.perform(get("/api/admin/1"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Leticia")));
	}//pruebaAdminGet

	@Test
	public void pruebaUsuarioGet() throws Exception {
		this.mockMvc.perform(get("/api/usuarios/2"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Daniel")));
	}//pruebaUsuarioGet


	@Test
	public void pruebaUsuarioDelete() throws Exception {
		this.mockMvc.perform(delete("/api/usuarios/7"))
				.andDo(print())
				.andExpect(status().isOk());
	}//pruebaUsuarioDelete


	@Test
	public void pruebaUsuarioPost() throws Exception {
		this.mockMvc.perform(post("/api/usuarios/")
				.contentType(MediaType.APPLICATION_JSON)
				//.content("{\"name\":\"América \",\"lastName\":\"Sánchez \",\"email\":\"correo@gmail.com\",\"phone\":\"562482045\",\"password\":\"RadioMed_03\"}"))
				.content(asJsonString(new Usuarios("Alejandra", "Alpuche", "correo24@gmail.com","562482045", "RadioMed_03"))))
				.andDo(print())
				.andExpect(status().isOk());
	}//pruebaUsuarioPost

	//Esto convierte el objeto en JSON
	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}//asJsonString

@Test
public void pruebaUsuarioPut() throws Exception {
	this.mockMvc.perform(put("/api/usuarios/4?oldPassword=RadioMed_04&newPassword=RadioMed04"))
			.andDo(print())
			.andExpect(status().isOk());
}//pruebaUsuarioPost


	@Test
	public void pruebaProductosGet() throws Exception {
		this.mockMvc.perform(get("/api/productos/8"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Guantes emplomados")));
	}//pruebaProductosGet

}//class