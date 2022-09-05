package com.question4;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ecommerce ecommerce = new Ecommerce();
		
		ecommerce.addProductToList(new Product("Shoes",2000,"Adidas",12));
		ecommerce.addProductToList(new Product("Ipad",100000,"Apple",2));
		ecommerce.addProductToList(new Product("Ipad",100000,"Apple",4));
		ecommerce.addProductToList(new Product("Shoes",4000,"Nike",4));
		ecommerce.addProductToList(new Product("Shoes",2000,"Adidas",8));
		ecommerce.addProductToList(new Product("otherProduct",2500,"Nike",3));
		System.out.println(ecommerce.showAllProduct());
		

		

	}

}
