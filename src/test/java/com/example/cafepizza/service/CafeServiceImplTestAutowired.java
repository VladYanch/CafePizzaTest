package com.example.cafepizza.service;

import com.example.cafepizza.model.Cafe;
import com.example.cafepizza.service.impl.CafeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CafeServiceImplTestAutowired {
    @Autowired
    private CafeServiceImpl service;
    private static List<Cafe> cafes;
    private static Cafe cafe;

    @Test
    void findAllCafesTest() {
        List<Cafe> result = service.findAll();
        assertEquals(6, result.size());
    }
    @Test
    void deleteCafeTest() {
        service.deleteCafe(1L);
        assertEquals(5, service.findAll().size());
    }
    @Test
    void findByIdTest() {
        assertEquals("Losteria Dortmund", service.findById(1L).get().getName());
    }
    @Test
    void addOrUpdate() {
        cafe = service.findById(1L).orElseThrow();
        cafe.setId(7L);
        service.addOrUpdate(cafe);
        assertEquals("Losteria Dortmund", service.findById(7L).get().getName());
    }
}