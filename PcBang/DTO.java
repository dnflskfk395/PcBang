package PcBang;
//입력된 값을 가져다 저장하는 DTO라는 자바파일
//이 자바파일은 단순히 입력된 정보를 DB로 보내기 위한 가방 역활
public class DTO {	
	String id;
	String password;
	String name;
	String gender;
	String tel;
	String birth;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}


	
	

}
