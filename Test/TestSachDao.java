package Test;

import java.util.Iterator;

import Dao.SachDao;
import Model.Sach;

public class TestSachDao {
    public static void main(String[] args) {
        /* Test Insert */
		/*
		Sach sach1 = new Sach("LTJV", "Lập trình Java", 50000, 2025);
		Sach sach2 = new Sach("LTC", "Lập trình C", 70000, 2030);

		SachDAO.getInstance().insert(sach2);


		for (int i = 0; i < 1000; i++) {
			Sach sach = new Sach("LT"+i, "Lập trình i: "+i, 20000, 2015);
			SachDAO.getInstance().insert(sach);
		}

		*/

        /* Test update */
        Sach sach2 = new Sach("LTC", "Lập trình C", 100000, 2030);
        SachDao.getInstance().update(sach2);

        /* Test delete */
        for (int i = 0; i < 1000; i++) {
            Sach sach = new Sach("LT"+i, "Lập trình i: "+i, 20000, 2015);
            SachDao.getInstance().delete(sach);
        }
    }
}

