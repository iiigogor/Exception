package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import ru.netology.domain.Book;
import ru.netology.domain.NotFoundExeption;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductRepositoryTest {
    private ProductRepository repo = new ProductRepository();


    Product b1 = new Book(1, "JAVA", 1000, "Netology1", 200, 1980);
    Product b2 = new Book(2, "PHP", 2000, "Netology2", 150, 1990);
    Product b3 = new Book(3, "C++", 3000, "Netology3", 250, 2000);

    @BeforeEach
    public void setUp() {
        repo.save(b1);
        repo.save(b2);
        repo.save(b3);
    }

    @Test
    void deleteIfExists() {
        repo.removeById(2);
        Product[] expected = new Product[]{b1, b3};
        Product[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldThrowAnException() {
        Assertions.assertThrows(NotFoundExeption.class, () -> {
            repo.removeById(5);
        });

    }
}