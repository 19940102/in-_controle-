package ext;


import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        double temp= 77;
        return  temp;

    }
}
