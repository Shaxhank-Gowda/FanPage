package dto;


import javax.persistence.Entity;
import javax.persistence.Id;

import com.mysql.cj.jdbc.Blob;

@Entity
public class Dto {
@Id
private int id;
private String name;
private String mail;
private String Gender; 
private long ph_no;
private byte[] img;
public String getGender() {
	return Gender;
}
public byte[] getImg() {
	return img;
}
public void setImg(byte[] img) {
	this.img = img;
}
public void setGender(String gender) {
	Gender = gender;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public long getPh_no() {
	return ph_no;
}
public void setPh_no(long ph_no) {
	this.ph_no = ph_no;
}



}

