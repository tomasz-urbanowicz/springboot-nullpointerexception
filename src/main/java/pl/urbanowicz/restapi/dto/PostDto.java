package pl.urbanowicz.restapi.dto;

import pl.urbanowicz.restapi.model.Post;

import java.time.LocalDateTime;

public class PostDto {

    private long id;
    private String title;
    private String content;
    private LocalDateTime created;

    public PostDto() {
    }

    public PostDto(long id, String title, String content, LocalDateTime created) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.created = created;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public static final class Builder {
        private long id;
        private String title;
        private String content;
        private LocalDateTime created;

        public static Builder builder() {
            return new Builder();
        }

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder created(LocalDateTime created) {
            this.created = created;
            return this;
        }

        public PostDto build() {
            PostDto postDto = new PostDto();
            postDto.id = this.id;
            postDto.title = this.title;
            postDto.content = this.content;
            postDto.created = this.created;

            return postDto;
        }
    }


}
