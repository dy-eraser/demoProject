package danial.demo.review.controller;

import danial.demo.review.dto.ProductCartDto;
import danial.demo.review.entity.Comment;
import danial.demo.review.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @RequestMapping(value = "/get/product/cart", method = RequestMethod.GET, name = "Get all comments!")
    public ProductCartDto getProductCart(@RequestParam Long productId) {
        return reviewService.getProductCart(productId);
    }

    public void voteProduct() {
        //TODO get votes from users and save into DB
    }

    public Page<Comment> getCommentsForApproval(Pageable pageable) {
        //TODO get all NOT approved comments for approval
        return null;
    }

    public void approveComment(@RequestParam Long CommentId) {
        //TODO approve the comment
        //This will effect totalVoteCount, totalVote in a product
    }
}
