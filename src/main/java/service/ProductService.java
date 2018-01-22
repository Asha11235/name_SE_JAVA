package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import entity.Products;
import repository.ProductRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	 @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	    public Products save(Products product) {
	        return productRepository.save(product);
	    }

}
