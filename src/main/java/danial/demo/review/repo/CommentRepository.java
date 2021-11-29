package danial.demo.review.repo;

import danial.demo.review.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query(nativeQuery = true,
            value = "SELECT * FROM comment WHERE product_id=:productId AND is_approved = true ORDER BY created_date DESC LIMIT 3")
    List<Comment> getLastThreeApproved(@Param("productId")Long productId);
}
