package com.ibm.takehome.dao;

import com.ibm.takehome.bean.Product;
import com.ibm.takehome.problem.NullException;

public interface IProductDao {
	Product getDetails(Integer productCode) throws NullException;
	boolean setDetails(Product productToEnlist);
}