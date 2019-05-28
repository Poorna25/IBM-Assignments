package com.ibm.takehome.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.takehome.bean.Product;
import com.ibm.takehome.problem.NullException;

public class ProductDao implements IProductDao {
	
	private static Map<Integer, Product> hMap;
	
	
	static	{
		ProductDao.hMap = new HashMap<Integer, Product>();
	}

		@Override
	public Product getDetails(Integer productCode) throws NullException {
		Product returnThis = ProductDao.hMap.get(productCode);
		if(returnThis != null)	return returnThis;
		else {
			throw new NullException("Exception occured while getting details");
		}
	}
	
	
	@Override
	public boolean setDetails(Product productToEnlist)	{
		return ProductDao.hMap.put(productToEnlist.getId(), productToEnlist) != null;
	}
	
	
	
	public Integer getId(Integer productCode) throws NullException	{
		Integer returnThis = this.getDetails(productCode).getId();
		if(returnThis != null)	return returnThis;
		else {
			throw new NullException("Exception occured while getting Id");
		}
	}
	
	public Integer getPrice(Integer productCode) throws NullException	{
		Integer returnThis = this.getDetails(productCode).getPrice();
		if(returnThis != null)	return returnThis;
		else {
			throw new NullException("Exception occured while getting price");
		}
	}	
	
	public String getName(Integer productCode) throws NullException	{
		String returnThis = this.getDetails(productCode).getName();
		if(returnThis != null)	return returnThis;
		else {
			throw new NullException("Exception occured while getting price");
		}
	}
	
	public String getCategory(Integer productCode) throws NullException	{
		String returnThis = this.getDetails(productCode).getCategory();
		if(returnThis != null)	return returnThis;
		else {
			throw new NullException("Exception occured while getting price");
		}
	}
	
	public String getDescription(Integer productCode) throws NullException	{
		String returnThis = this.getDetails(productCode).getDescription();
		if(returnThis != null)	return returnThis;
		else {
			throw new NullException("Exception occured while getting price");
		}
	}
}