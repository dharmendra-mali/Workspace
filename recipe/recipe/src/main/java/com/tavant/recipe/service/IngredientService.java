package com.tavant.recipe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tavant.recipe.modle.Ingredient;
import com.tavant.recipe.repository.IngredientRepository;

@Service
public class IngredientService {

	@Autowired
	private IngredientRepository ingredientRepository;

	public List<Ingredient> findAll() {

		return ingredientRepository.findAll();
	}

	public void save(Ingredient ingredient) {

		ingredientRepository.save(ingredient);

	}

	public Ingredient findById(String id) {
		return ingredientRepository.findById(id).get();
	}

	public void delete(String id) {

		Ingredient ingredient = ingredientRepository.findById(id).get();

		ingredientRepository.delete(ingredient);

	}

	public String findId(Ingredient ingredient) {

		String tempId = (String)ingredientRepository.findOnlyId(ingredient.getName(), ingredient.getAmount());

		return tempId;

	}

}
