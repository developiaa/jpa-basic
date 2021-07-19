package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("HelloA");


//            Member member = em.find(Member.class, 1L);
//            System.out.println("member.getId() = " + member.getId());
//            System.out.println("member.getName() = " + member.getName());
//            em.persist(member);
//
//            List<Member> result = em.createQuery("select m from Member as m", Member.class).getResultList();
//            for (Member member1 : result) {
//                System.out.println("member1 = " + member1);
//            }

            // 영속 상태에 데이터를 동일성을 보장
            Member member = em.find(Member.class, 1L);
            Member member1 = em.find(Member.class, 1L);
            System.out.println("(member == member1) = " + (member == member1));
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

}
