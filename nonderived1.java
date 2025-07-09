package com.p2;

import com.p1.protection;

public class nonderived1 {
	public nonderived1()
	{
		protection p=new protection();
		System.out.println("nonderived1's constructor called");
		//System.out.println("n :"+p.n);
		System.out.println("n_pub :"+p.n_pub);
		//System.out.println("n_pro :"+p.n_pro);
		//System.out.println("n_pri :"+n_pri);
	}


}
