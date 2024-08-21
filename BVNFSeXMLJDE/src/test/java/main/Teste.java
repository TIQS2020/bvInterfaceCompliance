package main;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.com.nfe.xml.envio.XmlFileEnvioRoot;
import br.com.nfe.xml.envio.vo.F55IJC02;
import br.com.nfe.xml.envio.vo.F55IJC80;
import br.com.nfe.xml.envio.vo.F55IJC81;
import br.com.nfe.xml.envio.vo.F55IJC81Item;
import br.com.nfe.xml.envio.vo.F55IJC82;
import br.com.nfe.xml.envio.vo.F55IJC83;
import br.com.nfe.xml.envio.vo.F55IJC84;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		F55IJC02 f55ijc02 = new F55IJC02();
		f55ijc02.setJCB76ELN("jfhdsajkfdhs");
		F55IJC80 f55ijc80 = new F55IJC80();
		f55ijc80.setJCA201("jfhdsajkfdhs");
		
		F55IJC81Item f55ijc81_1 = new F55IJC81Item();
		f55ijc81_1.setJC54RBDPW("aaaaaaa");
		f55ijc81_1.setId(1);
		F55IJC81Item f55ijc81_2 = new F55IJC81Item();
		f55ijc81_2.setJC54RBDPW("bbbbbbb");
		f55ijc81_2.setId(2);
		List<F55IJC81Item> listF55IJC81= new ArrayList<>();
		
		listF55IJC81.add(f55ijc81_1);
		listF55IJC81.add(f55ijc81_2);
		
		F55IJC81 f55IJC81 = new F55IJC81();
		f55IJC81.setItem(listF55IJC81);
		
		
		XmlFileEnvioRoot envioRoot = new XmlFileEnvioRoot(f55ijc80, f55IJC81, null, null, null, f55ijc02);
		
		try {
			JAXBContext context =  JAXBContext.newInstance(XmlFileEnvioRoot.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(envioRoot, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
