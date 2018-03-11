package com.wj.study._20180308;

public class Poker implements Comparable<Poker>{
	public String huaSe;
	public String dianShu;
	public Poker(String huaSe , String dianShu){
		this.huaSe = huaSe;
		this.dianShu = dianShu;
	}
	public Poker(){
		
	}
	
	@Override
	public int compareTo(Poker o) {
		// TODO Auto-generated method stub
		return this.dianShu.compareTo(o.dianShu);
	}

}
