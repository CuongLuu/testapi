package com.sinhvien.restful.entities;

//getting the values from the user and passing them to the SinhVien layer to be inserted into the database.
public class UserDTO {
	private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
