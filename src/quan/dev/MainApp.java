package quan.dev;

import quan.dev.data.dao.CategoryDao;
import quan.dev.data.impl.CategoryImpl;
import quan.dev.data.model.Category;

public class MainApp {

	public static void main(String[] args) {
		CategoryDao categoryDao = new CategoryImpl();
		Category cat = new Category(1, "ao dai", "hinh hoa sen");
		categoryDao.insert(cat);
		
		Category find = categoryDao.find(9);
		System.out.println(find.name);
		find.name = "them hoa o sau lung";
		categoryDao.update(find);
		
		categoryDao.delete(find.id);
	}

}
