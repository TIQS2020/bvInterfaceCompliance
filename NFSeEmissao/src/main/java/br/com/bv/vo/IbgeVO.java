package br.com.bv.vo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IbgeVO {
	
	private List<String> ibgeList;	

	public IbgeVO() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		String fileName = "C:\\Java\\resources\\CodigosIBGE_Replace.txt";
		Path path = Paths.get(fileName);		
		List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);		
		this.ibgeList = allLines;		
	}

	public List<String> getIbgeList() {
		return ibgeList;
	}

	public void setIbgeList(List<String> ibgeList) {
		this.ibgeList = ibgeList;
	}
	
	

}
