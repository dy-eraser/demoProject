INSERT INTO product (product_id, name, provider, visible, is_votable, is_commentable,
is_open_to_public_vote, is_open_to_public_comment, total_vote_count, total_vote)
VALUES (100, 'product_A', 'provider_A', true, true, true, false, false, 3, 13);

INSERT INTO comment (id, head_line, body, is_approved, created_date, product_id)
VALUES
(1, 'comment1', 'seems like a good product!', false, '2021-11-29', 100),
(2, 'comment2', 'seems like a good product!', true, '2021-11-28', 100),
(3, 'comment3', 'seems like a good product!', false, '2021-11-27', 100),
(4, 'comment4', 'seems like a good product!', true, '2021-11-26', 100),
(5, 'comment5', 'seems like a good product!', true, '2021-11-25', 100),
(6, 'comment6', 'seems like a good product!', true, '2021-11-24', 100);