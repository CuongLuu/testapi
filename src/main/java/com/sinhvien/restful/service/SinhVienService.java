package com.sinhvien.restful.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.sinhvien.restful.config.JwtTokenUtil;
import com.sinhvien.restful.entities.SinhVien;
import com.sinhvien.restful.entities.UserDTO;
import com.sinhvien.restful.repository.SinhVienRepository;
import com.sinhvien.restful.service.ServiceResult.Status;


@Service
public class SinhVienService {
	@Autowired
	JwtTokenUtil token;
	@Autowired
	UserDetailsService userService;
  @Autowired
  SinhVienRepository sinhVienRepo;
  public ServiceResult findAll() {
    ServiceResult result = new ServiceResult();
    result.setData(sinhVienRepo.findAll());
    return result;
  }
 
  public ServiceResult create(SinhVien sv) {
    ServiceResult result = new ServiceResult();
    result.setData(sinhVienRepo.save(sv));
    return result;
  }

  public ServiceResult Login(UserDTO user) {
	  ServiceResult result = new ServiceResult();
	  UserDetails userd;
	  SinhVien sv=sinhVienRepo.findByEmail(user.getUsername());
	  if(sv==null) {
		  result.setMessage("Email does not exist");
		  return result;
	  }
		  userd=userService.loadUserByUsername(user.getUsername());
		  
	  
		  
	  if(user.getPassword().equals(userd.getPassword())){
		  
		  result.setData(token.generateToken(userd));
	  }else {
		  result.setMessage("wrong password");
		  
	  }
		  
	  return result;
  }

 

}
