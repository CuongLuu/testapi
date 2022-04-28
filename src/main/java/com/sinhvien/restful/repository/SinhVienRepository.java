package com.sinhvien.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinhvien.restful.entities.SinhVien;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Integer> {
	 SinhVien findByEmail(String email);
	 SinhVien findByEmailAndMatKhau(String email, String matKhau);
}
