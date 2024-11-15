package ua.ithillel.dsalgo.model.product;

import java.util.Objects;

public class Book {
    private String id;
    private String name;
    private String description;
    private String author;
    private String publisher;
    private String category;
    private String type;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    private Book(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.author = builder.author;
        this.publisher = builder.publisher;
        this.category = builder.category;
        this.type = builder.type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Builder {
        private String id;
        private String name;
        private String description;
        private String author;
        private String publisher;
        private String category;
        private String type;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(id, book.id) && Objects.equals(name, book.name) && Objects.equals(description, book.description) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher) && Objects.equals(category, book.category) && Objects.equals(type, book.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, author, publisher, category, type);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
