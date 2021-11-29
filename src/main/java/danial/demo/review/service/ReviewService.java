package danial.demo.review.service;

import danial.demo.review.dto.ProductCartDto;
import danial.demo.review.entity.Product;
import danial.demo.review.repo.CommentRepository;
import danial.demo.review.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Optional;

@Service
public class ReviewService {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private ProductRepository productRepository;

    public ProductCartDto getProductCart(Long productId) {

        ProductCartDto dto = new ProductCartDto();
        Optional<Product> productOptional = productRepository.findById(productId);
        Product product = productOptional.orElseGet(Product::new);//TODO This should be replaced with a proper strategy!
        dto.setVotable(product.isVotable());
        dto.setCommentable(product.isCommentable());
        dto.setOpenToPublicVote(product.isOpenToPublicVote());
        dto.setOpenToPublicComment(product.isOpenToPublicComment());
        dto.setTotalVoteCount(product.getTotalVoteCount());
        dto.setVote(df.format((double) product.getTotalVote()/product.getTotalVoteCount()));
        dto.setComments(commentRepository.getLastThreeApproved(productId));

        return dto;
    }
}
