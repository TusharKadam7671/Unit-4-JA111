package com.question4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ecommerce{
	
	
	
	List<Product> productList = new ArrayList<>();
	
	void addProductToList(Product product)
	{
		
		Iterator<Product> p = productList.iterator();
		int c =0;
		
		while(p.hasNext())
		{
			Product pro = (Product)p.next();
			if(pro.getCompany().equals(product.company) && pro.getName().equals(product.name))
			{
				int count=pro.getCount()+product.count;
				pro.setCount(count);
				c++;
				System.out.println("Count updated Product already exists");
			}
		}

		
		if(c==0)
		{
			productList.add(product);
			System.out.println("Product added successfully");
		}
		
	}
	
	String showAllProduct()
	{
		if(productList.isEmpty())
		{
			System.out.println("List is empty");
			return null;
		}else
		{
			return productList.toString();
		}
	}

}
