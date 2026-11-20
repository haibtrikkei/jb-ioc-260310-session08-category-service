package ra.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.demo.response.ApiResponse;
import ra.demo.response.Category;
import ra.demo.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<Category>>> getCategories() {
        return new ResponseEntity<>(new ApiResponse<>(
                true,
                "Lấy danh sách danh mục thành công",
                categoryService.getCategories(),
                null,
                HttpStatus.OK
        ), HttpStatus.OK);
    }

    @GetMapping("/data-for-product-call")
    public List<Category> getCategoriesForProduct() {
        return categoryService.getCategories();
    }
}
