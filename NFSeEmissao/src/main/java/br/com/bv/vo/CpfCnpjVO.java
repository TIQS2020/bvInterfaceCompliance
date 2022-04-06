package br.com.bv.vo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CpfCnpjVO {
	private List<String> cpfCnpjList;	

	public CpfCnpjVO() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		String fileName = "C:\\Java\\resources\\cpfCnpjIbge_Replace.txt";
		Path path = Paths.get(fileName);		
		List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);		
		this.cpfCnpjList = allLines;		
	}

	public List<String> getIbgeList() {
		return cpfCnpjList;
	}

	public void setIbgeList(List<String> ibgeList) {
		this.cpfCnpjList = ibgeList;
	}
}
