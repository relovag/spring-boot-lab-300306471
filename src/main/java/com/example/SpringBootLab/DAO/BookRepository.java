package com.example.SpringBootLab.DAO;

import com.example.SpringBootLab.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

public interface BookRepository extends MongoRepository <Book, Repository> {
}
