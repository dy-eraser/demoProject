package danial.demo.review.dto;

import danial.demo.review.entity.Comment;

import java.util.ArrayList;
import java.util.List;

public class ProductCartDto {

    private boolean isVotable;
    private boolean isCommentable;
    private boolean isOpenToPublicVote;
    private boolean isOpenToPublicComment;

    private Long totalVoteCount;
    private String vote;

    //Last 3 comments
    private List<CommentDto> comments;

    static class CommentDto {
        private String headLine;
        private String body;

        public String getHeadLine() {
            return headLine;
        }

        public void setHeadLine(String headLine) {
            this.headLine = headLine;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
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

    public Long getTotalVoteCount() {
        return totalVoteCount;
    }

    public void setTotalVoteCount(Long totalVoteCount) {
        this.totalVoteCount = totalVoteCount;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public List<CommentDto> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        List<CommentDto> ret = new ArrayList<>();
        for (Comment comment : comments) {
            CommentDto commentDto = new CommentDto();
            commentDto.setHeadLine(comment.getHeadLine());
            commentDto.setBody(comment.getBody());
            ret.add(commentDto);
        }
        this.comments = ret;
    }
}
