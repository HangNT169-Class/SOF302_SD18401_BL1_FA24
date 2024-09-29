package com.poly.hangnt169.B9_JPA.repository;

import com.poly.hangnt169.B9_JPA.entity.Category1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category1, Long> {
    // JPA<TS1,TS2>
    // TS1: Doi tuong ma cac ban muon lam viec
    // TS2: Kieu du lieu cua khoa chinh ( KHONG NHAN KIEU NGUYEN THUY)
    // CRUD 1 bang => k can phai viet
    // lay ra hien thi tat ca => findAll()
    // Add / update => save
    // detail => findById()
    // xoa: delete(Object doi tuong)
    // xoa: deleteById(khoa chinh)
    // Tu custom lai cau lenh SQL
    // Tat ca truy van => Truy van tren thuc the (@entity)
    // C1: Raw SQL ( dua vao ten ham de truy van dieu kien)
    Category1 findByCategoryCodeOOrderById(String categoryCode);

    // Neu ten dieu kien cua cau truy van cang dai => ten ham cang dai
    // C2: JPQL(JPA Query Language) => TRUY VAN TREN THUC THE
    // 1. Truyen dau ? => Dung voi vi tri cua tham so truyen vao
    // 2/1: vi tri cua tham so truyen vao
//    @Query("SELECT c FROM Category1 c WHERE c.categoryName LIKE ?2 AND c.categoryCode LIKE ?1")
//    Category1 searchName(String categoryCode, String categoryName);
    // 2. :ten bien => @Param
    @Query("SELECT c FROM Category1 c WHERE c.categoryName LIKE :name AND c.categoryCode LIKE :code")
    Category1 searchName(@Param("code") String categoryCode, @Param("name") String categoryName);

    // C3: native query (interface de hung doi tuong) => TRUY VAN TREN SQL (*)
    @Query(value = "cau sql", nativeQuery = true)
    Category1 search1(String name);
    // FINISH CRUD CATEGORY (THEM,SUA,XOA)
}
