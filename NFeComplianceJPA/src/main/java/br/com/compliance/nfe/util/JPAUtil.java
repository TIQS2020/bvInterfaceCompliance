package br.com.compliance.nfe.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public abstract class JPAUtil {
	
	private static final String pu = "NFeComplianceJPA";
    private static EntityManagerFactory emf;
    private static EntityManager em;

    /*
    private static EntityManagerFactory getEntityManagerFactory() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(pu);
        }
        return emf;
    }

    public static EntityManager getEntityManager() {
        if (emf == null) {
            getEntityManagerFactory();
        }
        if (em == null) {
            em = emf.createEntityManager();
        }
        return em;
    }
    
    public static void closeEntityManagerFactory(){
    	if (emf != null) {
            emf.close();
        }
    }
           
    public static void closeEntityManager(){
    	if(em != null){
    		em.close();
    	}
    }
    
    public static void beginTransaction() {
    	if(!getEntityManager().getTransaction().isActive()){
    		getEntityManager().getTransaction().begin();
    	}    	
    }

    public static void commit() {
		getEntityManager().getTransaction().commit();
	}

	public static void rollback() {
		if(getEntityManager().getTransaction().isActive()) {
			getEntityManager().getTransaction().rollback();
		}
	}
	
	public static void lockOptimistic(Object entity) {
		getEntityManager().lock(entity, LockModeType.OPTIMISTIC);
	}

	public static void lockPessimisticRead(Object entity) {
		getEntityManager().lock(entity, LockModeType.PESSIMISTIC_READ);
	}
	*/
}
