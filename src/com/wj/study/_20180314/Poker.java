package com.wj.study._20180314;


public class Poker implements Comparable<Poker>{
	public Integer k;
	public String pok;
	public Poker(Integer k , String pok){
		this.k = k;
		this.pok = pok;
	}
	public Poker(){
		
	}
	@Override
	public int compareTo(Poker o) {
		// TODO Auto-generated method stub
		return this.k.compareTo(o.k);
	}

}
