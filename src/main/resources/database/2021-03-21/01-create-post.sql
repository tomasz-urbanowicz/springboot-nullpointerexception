--liquibase formatted sql
--changeset turbanowicz:1
CREATE TABLE post
(
    id      BIGINT AUTO_INCREMENT PRIMARY KEY,
    title   VARCHAR(400)  NOT NULL,
    content VARCHAR(2000) NULL,
    created  timestamp
);
