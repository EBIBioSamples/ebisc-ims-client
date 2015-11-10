package uk.ac.ebi.biosd.ebisc;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import uk.ac.ebi.biosd.ebisc.model.CellLine;
import uk.ac.ebi.biosd.ebisc.model.CellLinePage;

@Service
@PropertySource("classpath:ebisc.properties")
public class IMSDAO {
	
	@Value("${ebisc.api.host}")
	private String apiHost;
	@Value("${ebisc.api.username}")
	private String apiUsername;
	@Value("${ebisc.api.key}")
	private String apiKey;


	protected RestTemplate restTemplate = new RestTemplate();
	
	private Logger log = Logger.getLogger(IMSDAO.class);
	
	public CellLinePage getCellLinePage(int pageNo) throws RestClientException {
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host(apiHost)
				.pathSegment("api", "v0", "cell-lines")
				.queryParam("limit", 50)
				.queryParam("offset", 50*pageNo)
				.build();

		log.trace("URI = "+uriComponents.toUriString());
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "ApiKey "+apiUsername+":"+apiKey);
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		ResponseEntity<CellLinePage> responce = restTemplate.exchange(uriComponents.toUri(), HttpMethod.GET, entity, CellLinePage.class);
		
		log.trace("HTTP code = "+responce.getStatusCode());
		
		return responce.getBody();
	}
	
	public CellLine getCellLine(String biosampleId) throws RestClientException {
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.scheme("https")
				.host(apiHost)
				.pathSegment("api", "v0", "cell-lines", biosampleId)
				.build();

		log.trace("URI = "+uriComponents.toUriString());
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "ApiKey "+apiUsername+":"+apiKey);
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		ResponseEntity<CellLine> responce = restTemplate.exchange(uriComponents.toUri(), HttpMethod.GET, entity, CellLine.class);
		
		log.trace("HTTP code = "+responce.getStatusCode());
		
		return responce.getBody();
	}
}
