package br.com.compliance.nfe.teste;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jpa.EntityManagerHelper;

public class TestJPA {
	
	public static void main(String[] args){
			
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC80> cQuery = cb.createQuery(F55IJC80.class);
		Root<F55IJC80> cabecalho = cQuery.from(F55IJC80.class);

		Expression<F55IJC80> eJcdej = cabecalho.get("JCDEJ");
		Expression<F55IJC80> eJcev14 = cabecalho.get("JCEV14");
		Expression<F55IJC80> eJcev15 = cabecalho.get("JCEV15");

		Predicate pJcdej = cb.equal(eJcdej, "0");
		Predicate pJcev14 = cb.equal(eJcev14, 1);
		Predicate pJcev15 = cb.equal(eJcev15, "0");
		Predicate predicate = cb.and(pJcdej, pJcev14, pJcev15);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F55IJC80> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);

		List<F55IJC80> listF55IJC80 = query.getResultList();
		
		for(F55IJC80 f : listF55IJC80){
			System.out.println(f.toString());
		}

		EntityManagerHelper.closeEntityManager();
	}	
	
}
