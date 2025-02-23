package study.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import study.validation.aadhar.ValidAadharCard;
import study.validation.pan.ValidPanCard;

public class UserDTO {
	
	@NotBlank
	@NotNull
	private String name;
	
	@ValidAadharCard
	private String aadharNumber;
	
	@ValidPanCard
	private String panCard;

	public UserDTO(@NotBlank @NotNull String name, String aadharNumber, String panCard) {
		super();
		this.name = name;
		this.aadharNumber = aadharNumber;
		this.panCard = panCard;
	}

	public UserDTO() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", aadharNumber=" + aadharNumber + ", panCard=" + panCard + "]";
	}

	
	
	
}
