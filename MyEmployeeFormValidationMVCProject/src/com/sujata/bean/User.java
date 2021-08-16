package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

	@Getter
	@Setter
	private String username;
	@Getter
	@Setter
	private String password;
}
