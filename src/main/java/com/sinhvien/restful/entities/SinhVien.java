package com.sinhvien.restful.entities;
import javax.persistence.*;
@Entity
@Table(name = "sinhvien")
public class SinhVien {
  @Id
  @Column(name = "mssv")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int mssv;
  @Column(name = "hoTen")
  private String hoTen;
  @Column(name = "gioiTinh")
  private String gioiTinh;
  @Column(name = "diaChi")
  private String diaChi;
  @Column(name = "matKhau")
  private String matKhau;
  @Column(name = "email")
  private String email;
  //constructor
  public SinhVien() {
	
  }
  //getter-setter
  public int getMssv() {
	  return mssv;
  }
  public void setMssv(int mssv) {
	  this.mssv = mssv;
  }
  public String getHoTen() {
	  return hoTen;
  }
  public void setHoTen(String hoTen) {
	  this.hoTen = hoTen;
  }
  public String getGioiTinh() {
	  return gioiTinh;
  }
  public void setGioiTinh(String gioiTinh) {
	  this.gioiTinh = gioiTinh;
  }
  public String getDiaChi() {
	  return diaChi;
  }
  public void setDiaChi(String diaChi) {
	  this.diaChi = diaChi;
  }
  public String getMatKhau() {
	  return matKhau;
  }
  public void setMatKhau(String matKhau) {
	  this.matKhau = matKhau;
  }
  public String getEmail() {
	  return email;
  }
  public void setEmail(String email) {
	this.email = email;
  }
  
  
  
}
