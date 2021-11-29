package danial.demo.review.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    private String name;
    private String provider;
    private boolean visible;
    private boolean isVotable;
    private boolean isCommentable;
    private boolean isOpenToPublicVote;
    private boolean isOpenToPublicComment;
    @OneToMany(mappedBy = "product", cascade = CascadeType.PERSIST, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<Comment> comments;
    //Vote
    private Long totalVoteCount;//Number of users that voted the product
    private Long totalVote;     //Total votes added all together (out of 5 stars)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isVotable() {
        return isVotable;
    }

    public void setVotable(boolean votable) {
        isVotable = votable;
    }

    public boolean isCommentable() {
        return isCommentable;
    }

    public void setCommentable(boolean commentable) {
        isCommentable = commentable;
    }

    public boolean isOpenToPublicVote() {
        return isOpenToPublicVote;
    }

    public void setOpenToPublicVote(boolean openToPublicVote) {
        isOpenToPublicVote = openToPublicVote;
    }

    public boolean isOpenToPublicComment() {
        return isOpenToPublicComment;
    }

    public void setOpenToPublicComment(boolean openToPublicComment) {
        isOpenToPublicComment = openToPublicComment;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Long getTotalVoteCount() {
        return totalVoteCount;
    }

    public void setTotalVoteCount(Long totalVoteCount) {
        this.totalVoteCount = totalVoteCount;
    }

    public Long getTotalVote() {
        return totalVote;
    }

    public void setTotalVote(Long totalVote) {
        this.totalVote = totalVote;
    }
}
