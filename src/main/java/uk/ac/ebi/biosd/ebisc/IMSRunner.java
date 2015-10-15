package uk.ac.ebi.biosd.ebisc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import uk.ac.ebi.biosd.ebisc.model.CellLinePage;

@Controller
public class IMSRunner implements CommandLineRunner {

	@Autowired
	private IMSDAO dao;	
	
	@Override
	public void run(String... arg0) throws Exception {	
		CellLinePage page = dao.getCellLinePage(0);
		System.out.println(page.getMeta().getTotalCount());
	}

}
