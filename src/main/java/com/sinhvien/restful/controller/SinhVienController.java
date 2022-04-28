package com.sinhvien.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinhvien.restful.entities.SinhVien;
import com.sinhvien.restful.entities.UserDTO;
import com.sinhvien.restful.service.ServiceResult;
import com.sinhvien.restful.service.SinhVienService;

@Repository
@RequestMapping("/api/")
public class SinhVienController {
	
		@Autowired
		private SinhVienService sinhVienService;
		
		
		//Get all Sinh vien
		@GetMapping("sinhvien")
	 	public ResponseEntity<ServiceResult> findAllSinhVien() {
			return new ResponseEntity<ServiceResult>(sinhVienService.findAll(), HttpStatus.OK);
		}
	 
		//Create new Sinh vien
		@PostMapping("/sinhvien")
		public ResponseEntity<ServiceResult> create(@RequestBody SinhVien sv) {
			return new ResponseEntity<ServiceResult>(sinhVienService.create(sv), HttpStatus.OK);
		}
		
		//login
		@PostMapping("/login")
		public ResponseEntity<ServiceResult> DangNhap(@RequestBody UserDTO user ) {
			return new ResponseEntity<ServiceResult>(sinhVienService.Login(user), HttpStatus.OK);
		}
		
	  
}