package ra.demo.service.impl;

import org.springframework.stereotype.Service;
import ra.demo.response.Category;
import ra.demo.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public List<Category> getCategories() {
        return List.of(
                new Category("C01","Điện tử",true),
                new Category("C02","Điện thoại",true),
                new Category("C03","Máy tính",true),
                new Category("C04","Laptop",true)
        );
    }
}
