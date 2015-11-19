package com.verdicchio;

import com.verdicchio.model.Category;
import com.verdicchio.model.Item;

import java.util.List;

/**
 * Created by verdian on 12/11/2015.
 */
public interface InventorySystemClient {

     Boolean checkApplicability();

    List<Category> getCategory();

     List<? extends Item> getItemByCategory(long idCategory);


}
