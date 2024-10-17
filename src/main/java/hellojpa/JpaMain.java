package hellojpa;
import hellojpa.jpashop.domain.Book;
import hellojpa.jpashop.domain.Movie;
import hellojpa.jpashop.domain.Order;
import hellojpa.jpashop.domain.OrderItem;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Book book = new Book();
            book.setName("JPA");
            book.setAuthor("as");

            Movie movie = new Movie();
            movie.setArtist("asd");
            movie.setDirector("dd");
            em.persist(book);
            em.persist(movie);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }

}
