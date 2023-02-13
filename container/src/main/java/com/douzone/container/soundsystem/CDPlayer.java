package com.douzone.container.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	@Autowired
	private CompactDisc cd;
	
	// 위의 Autowired 8-9줄 문법 대신 아래의 문법 사용 권장
	// private의 Autowired는 권장되지 않음(보안상의 문제로..)
	CDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	
	public String play() {
		return cd.play();
	}

}
