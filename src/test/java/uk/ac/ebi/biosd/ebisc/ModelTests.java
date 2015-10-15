package uk.ac.ebi.biosd.ebisc;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.junit.Test;
import org.springframework.http.HttpMethod;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import uk.ac.ebi.biosd.ebisc.model.CellLinePage;

public class ModelTests {

	//test that jackson can deserialize a json representation
	//note that this json representation is stored in a local file
	//and should be updated when the IMS is
	@Test
	public void testJsonDeserialize() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper om = new ObjectMapper();
		CellLinePage p;
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/cell-lines.json")));
			p = om.readValue(in, CellLinePage.class);
		} finally {
			if (in != null) {
				in.close();
			}
		}
		assertEquals("Number of cell lines must be 50", 50, p.getObjects().size());
	}
}
