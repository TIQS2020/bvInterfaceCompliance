package br.com.compliance.nfe.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CacheStoreMode;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.eclipse.persistence.config.QueryHints;

import br.com.compliance.nfe.jde.domain.F55IJC53;
import br.com.compliance.nfe.jde.domain.F55IJC53Id;
import br.com.compliance.nfe.jpa.EntityManagerHelper;

public class F55IJC53Dao {
	
public List<F55IJC53> listF55IJC53ById(F55IJC53Id id) {	
		
		List<F55IJC53> listF55IJC53 = new ArrayList<F55IJC53>();
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC53> cQuery = cb.createQuery(F55IJC53.class);
		Root<F55IJC53> cabecalho = cQuery.from(F55IJC53.class);
		
		/*TODO: [MAPEAMENTO] ASSUMI A CHAVE COMO CRIT�RIO DA BUSCA*/
		//Expression<F55IJC51> eJCCO = cabecalho.get("JCCO");
		Expression<F55IJC53> eJCWJOBS = cabecalho.get("JCWJOBS");
		Expression<F55IJC53> eJCBEGDATE = cabecalho.get("JCBEGDATE");
		Expression<F55IJC53> eJCENDDATE = cabecalho.get("JCENDDATE");
		//Expression<F55IJC51> eJCITM = cabecalho.get("JCITM");
		//Expression<F55IJC51> eJCUOM1 = cabecalho.get("JCUOM1");
		Expression<F55IJC53> eJCEV15 = cabecalho.get("JCEV15");
				
		//Predicate pJCCO = cb.equal(eJCCO, id.getJCCO());
		Predicate pJCWJOBS = cb.equal(eJCWJOBS, id.getJCWJOBS());
		Predicate pJCBEGDATE = cb.equal(eJCBEGDATE, id.getJCBEGDATE());
		Predicate pJCENDDATE = cb.equal(eJCENDDATE, id.getJCENDDATE());
		//Predicate pJCITM = cb.equal(eJCITM, id.getJCITM());
		//Predicate pJCUOM1 = cb.equal(eJCUOM1, id.getJCUOM1());
		Predicate pJCEV15Zero = cb.equal(eJCEV15, "0");
		Predicate pJCEV15Branco = cb.equal(eJCEV15, "");
		Predicate pJCEV15Null = cb.isNull(eJCEV15);
				
		/*TODO: FILTRO PROPOSTO NA FUNCIONAL*/
		Predicate predicateEV15 = cb.or(pJCEV15Zero,pJCEV15Branco,pJCEV15Null);
		Predicate predicate = cb.and(pJCWJOBS,pJCBEGDATE,pJCENDDATE, predicateEV15);
		
		/*TODO: CHAVE DA TABELA NO BANCO
		Predicate predicate = cb.and(pJCCO,pJCWJOBS,pJCBEGDATE,pJCENDDATE,pJCITM,pJCUOM1);
		*/
		
		cQuery.select(cabecalho);
		cQuery.where(predicate);
		
		TypedQuery<F55IJC53> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
						
		if(!query.getResultList().isEmpty()){
			listF55IJC53 = query.getResultList();
		}				
		
		EntityManagerHelper.closeEntityManager();
		
		return listF55IJC53;
		
	}

}
