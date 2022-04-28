package com.sinhvien.restful.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sinhvien.restful.entities.MyCustomUserDetail;
import com.sinhvien.restful.entities.SinhVien;
import com.sinhvien.restful.repository.SinhVienRepository;

@Service
public class MyCustomUserDetailService implements UserDetailsService {

    @Autowired
   SinhVienRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        SinhVien sv = repository.findByEmail(email);
        if(sv != null)
            return new MyCustomUserDetail(sv);
        else throw new UsernameNotFoundException("User not found with username: " + sv.getEmail());

    }
}
